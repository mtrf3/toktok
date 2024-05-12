package androidx.lifecycle;

import X.C28O;
import X.InterfaceC73650SvO;
import X.InterfaceC73651SvP;
import X.InterfaceC73740Swq;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class LiveDataReactiveStreams {

    /* loaded from: classes.dex */
    public static class PublisherLiveData<T> extends LiveData<T> {
        public final InterfaceC73650SvO<T> mPublisher;
        public final AtomicReference<PublisherLiveData<T>.LiveDataSubscriber> mSubscriber = new AtomicReference<>();

        /* loaded from: classes.dex */
        public final class LiveDataSubscriber extends AtomicReference<InterfaceC73651SvP> implements InterfaceC73740Swq<T> {
            @Override // X.InterfaceC73740Swq
            public void onComplete() {
                AtomicReference<PublisherLiveData<T>.LiveDataSubscriber> atomicReference = PublisherLiveData.this.mSubscriber;
                while (!atomicReference.compareAndSet(this, null) && atomicReference.get() == this) {
                }
            }

            public void cancelSubscription() {
                InterfaceC73651SvP interfaceC73651SvP = get();
                if (interfaceC73651SvP != null) {
                    interfaceC73651SvP.cancel();
                }
            }

            public LiveDataSubscriber() {
            }

            @Override // X.InterfaceC73740Swq
            public void onError(final Throwable th) {
                AtomicReference<PublisherLiveData<T>.LiveDataSubscriber> atomicReference = PublisherLiveData.this.mSubscriber;
                while (!atomicReference.compareAndSet(this, null) && atomicReference.get() == this) {
                }
                C28O.LLLLZ().LL(new Runnable() { // from class: androidx.lifecycle.LiveDataReactiveStreams.PublisherLiveData.LiveDataSubscriber.1
                    @Override // java.lang.Runnable
                    public void run() {
                        androidx_lifecycle_LiveDataReactiveStreams$PublisherLiveData$LiveDataSubscriber$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void androidx_lifecycle_LiveDataReactiveStreams$PublisherLiveData$LiveDataSubscriber$1__run$___twin___() {
                        throw new RuntimeException("LiveData does not handle errors. Errors from publishers should be handled upstream and propagated as state", th);
                    }

                    public static void androidx_lifecycle_LiveDataReactiveStreams$PublisherLiveData$LiveDataSubscriber$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                        boolean LIZ;
                        try {
                            anonymousClass1.androidx_lifecycle_LiveDataReactiveStreams$PublisherLiveData$LiveDataSubscriber$1__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
            }

            @Override // X.InterfaceC73740Swq
            public void onNext(T t) {
                PublisherLiveData.this.postValue(t);
            }

            @Override // X.InterfaceC73740Swq
            public void onSubscribe(InterfaceC73651SvP interfaceC73651SvP) {
                if (compareAndSet(null, interfaceC73651SvP)) {
                    interfaceC73651SvP.request(Long.MAX_VALUE);
                } else {
                    interfaceC73651SvP.cancel();
                }
            }
        }

        @Override // androidx.lifecycle.LiveData
        public void onActive() {
            super.onActive();
            PublisherLiveData<T>.LiveDataSubscriber liveDataSubscriber = new LiveDataSubscriber();
            this.mSubscriber.set(liveDataSubscriber);
            this.mPublisher.subscribe(liveDataSubscriber);
        }

        @Override // androidx.lifecycle.LiveData
        public void onInactive() {
            super.onInactive();
            PublisherLiveData<T>.LiveDataSubscriber andSet = this.mSubscriber.getAndSet(null);
            if (andSet != null) {
                andSet.cancelSubscription();
            }
        }

        public PublisherLiveData(InterfaceC73650SvO<T> interfaceC73650SvO) {
            this.mPublisher = interfaceC73650SvO;
        }
    }

    /* loaded from: classes.dex */
    public static final class LiveDataPublisher<T> implements InterfaceC73650SvO<T> {
        public final LifecycleOwner mLifecycle;
        public final LiveData<T> mLiveData;

        /* loaded from: classes.dex */
        public static final class LiveDataSubscription<T> implements InterfaceC73651SvP, Observer<T> {
            public volatile boolean mCanceled;
            public T mLatest;
            public final LifecycleOwner mLifecycle;
            public final LiveData<T> mLiveData;
            public boolean mObserving;
            public long mRequested;
            public final InterfaceC73740Swq<? super T> mSubscriber;

            @Override // X.InterfaceC73651SvP
            public void cancel() {
                if (this.mCanceled) {
                    return;
                }
                this.mCanceled = true;
                C28O.LLLLZ().LL(new Runnable() { // from class: androidx.lifecycle.LiveDataReactiveStreams.LiveDataPublisher.LiveDataSubscription.2
                    @Override // java.lang.Runnable
                    public void run() {
                        androidx_lifecycle_LiveDataReactiveStreams$LiveDataPublisher$LiveDataSubscription$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void androidx_lifecycle_LiveDataReactiveStreams$LiveDataPublisher$LiveDataSubscription$2__run$___twin___() {
                        LiveDataSubscription liveDataSubscription = LiveDataSubscription.this;
                        if (liveDataSubscription.mObserving) {
                            liveDataSubscription.mLiveData.removeObserver(liveDataSubscription);
                            LiveDataSubscription.this.mObserving = false;
                        }
                        LiveDataSubscription.this.mLatest = null;
                    }

                    public static void androidx_lifecycle_LiveDataReactiveStreams$LiveDataPublisher$LiveDataSubscription$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                        boolean LIZ;
                        try {
                            anonymousClass2.androidx_lifecycle_LiveDataReactiveStreams$LiveDataPublisher$LiveDataSubscription$2__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
            }

            @Override // androidx.lifecycle.Observer
            public void onChanged(T t) {
                if (this.mCanceled) {
                    return;
                }
                if (this.mRequested > 0) {
                    this.mLatest = null;
                    this.mSubscriber.onNext(t);
                    long j = this.mRequested;
                    if (j != Long.MAX_VALUE) {
                        this.mRequested = j - 1;
                        return;
                    }
                    return;
                }
                this.mLatest = t;
            }

            @Override // X.InterfaceC73651SvP
            public void request(final long j) {
                if (this.mCanceled) {
                    return;
                }
                C28O.LLLLZ().LL(new Runnable() { // from class: androidx.lifecycle.LiveDataReactiveStreams.LiveDataPublisher.LiveDataSubscription.1
                    @Override // java.lang.Runnable
                    public void run() {
                        androidx_lifecycle_LiveDataReactiveStreams$LiveDataPublisher$LiveDataSubscription$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void androidx_lifecycle_LiveDataReactiveStreams$LiveDataPublisher$LiveDataSubscription$1__run$___twin___() {
                        long j2;
                        if (LiveDataSubscription.this.mCanceled) {
                            return;
                        }
                        long j3 = j;
                        if (j3 <= 0) {
                            LiveDataSubscription.this.mCanceled = true;
                            LiveDataSubscription liveDataSubscription = LiveDataSubscription.this;
                            if (liveDataSubscription.mObserving) {
                                liveDataSubscription.mLiveData.removeObserver(liveDataSubscription);
                                LiveDataSubscription.this.mObserving = false;
                            }
                            LiveDataSubscription liveDataSubscription2 = LiveDataSubscription.this;
                            liveDataSubscription2.mLatest = null;
                            liveDataSubscription2.mSubscriber.onError(new IllegalArgumentException("Non-positive request"));
                            return;
                        }
                        LiveDataSubscription liveDataSubscription3 = LiveDataSubscription.this;
                        long j4 = liveDataSubscription3.mRequested;
                        if (j4 + j3 >= j4) {
                            j2 = j4 + j3;
                        } else {
                            j2 = Long.MAX_VALUE;
                        }
                        liveDataSubscription3.mRequested = j2;
                        if (!liveDataSubscription3.mObserving) {
                            liveDataSubscription3.mObserving = true;
                            liveDataSubscription3.mLiveData.observe(liveDataSubscription3.mLifecycle, liveDataSubscription3);
                            return;
                        }
                        T t = liveDataSubscription3.mLatest;
                        if (t == null) {
                            return;
                        }
                        liveDataSubscription3.onChanged(t);
                        LiveDataSubscription.this.mLatest = null;
                    }

                    public static void androidx_lifecycle_LiveDataReactiveStreams$LiveDataPublisher$LiveDataSubscription$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                        boolean LIZ;
                        try {
                            anonymousClass1.androidx_lifecycle_LiveDataReactiveStreams$LiveDataPublisher$LiveDataSubscription$1__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
            }

            public LiveDataSubscription(InterfaceC73740Swq<? super T> interfaceC73740Swq, LifecycleOwner lifecycleOwner, LiveData<T> liveData) {
                this.mSubscriber = interfaceC73740Swq;
                this.mLifecycle = lifecycleOwner;
                this.mLiveData = liveData;
            }
        }

        @Override // X.InterfaceC73650SvO
        public void subscribe(InterfaceC73740Swq<? super T> interfaceC73740Swq) {
            interfaceC73740Swq.onSubscribe(new LiveDataSubscription(interfaceC73740Swq, this.mLifecycle, this.mLiveData));
        }

        public LiveDataPublisher(LifecycleOwner lifecycleOwner, LiveData<T> liveData) {
            this.mLifecycle = lifecycleOwner;
            this.mLiveData = liveData;
        }
    }

    public static <T> LiveData<T> fromPublisher(InterfaceC73650SvO<T> interfaceC73650SvO) {
        return new PublisherLiveData(interfaceC73650SvO);
    }

    public static <T> InterfaceC73650SvO<T> toPublisher(LifecycleOwner lifecycleOwner, LiveData<T> liveData) {
        return new LiveDataPublisher(lifecycleOwner, liveData);
    }
}
