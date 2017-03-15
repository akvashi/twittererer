package com.zedeff.twittererer.presenters;

import com.zedeff.twittererer.R;
import com.zedeff.twittererer.models.TimelineItem;
import com.zedeff.twittererer.services.TwitterService;
import com.zedeff.twittererer.views.TimelineView;

import java.lang.ref.WeakReference;
import java.util.List;

import javax.inject.Inject;

import rx.Scheduler;

public class TimelinePresenter {

    private final TwitterService service;
    private final Scheduler scheduler;
    private WeakReference<TimelineView> view;
    private List<TimelineItem> timelineItems;

    @Inject
    public TimelinePresenter(TwitterService service, Scheduler scheduler) {
        this.service = service;
        this.scheduler = scheduler;
    }

    public void initialise(TimelineView view) {
        this.view = new WeakReference<>(view);

    }

    public void refreshTweets() {

    }

    public void tweet(String tweetText) {

    }
}
