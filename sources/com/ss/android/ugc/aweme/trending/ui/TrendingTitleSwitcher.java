package com.ss.android.ugc.aweme.trending.ui;

import X.C221108m2;
import X.C32I;
import X.C56406MBu;
import X.C56424MCm;
import X.C62822Ol8;
import X.C76800UCe;
import X.InterfaceC88471Ynr;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextSwitcher;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.search.TrendingEventModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class TrendingTitleSwitcher implements GenericLifecycleObserver {
    public final TextSwitcher LJLIL;
    public final LifecycleOwner LJLILLLLZI;
    public final List<TrendingEventModel> LJLJI;
    public final InterfaceC88471Ynr<String, Integer, C76800UCe> LJLJJI;
    public final C62822Ol8 LJLJJL;
    public int LJLJJLL;
    public List<String> LJLJL;
    public final List<String> LJLJLJ;
    public final HashSet<String> LJLJLLL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_START) {
            onStart();
        } else if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        }
    }

    public final void init() {
        Lifecycle lifecycle;
        if (this.LJLJI.isEmpty()) {
            return;
        }
        TextSwitcher textSwitcher = this.LJLIL;
        Animation loadAnimation = AnimationUtils.loadAnimation(textSwitcher.getContext(), R.anim.c8);
        loadAnimation.setDuration(250L);
        textSwitcher.setInAnimation(loadAnimation);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(textSwitcher.getContext(), R.anim.eh);
        loadAnimation2.setDuration(250L);
        textSwitcher.setOutAnimation(loadAnimation2);
        textSwitcher.setFactory(new C56406MBu(this));
        if (!C56424MCm.LIZ()) {
            LIZ(0, false);
        } else {
            LIZIZ(0, false);
        }
        this.LJLJJLL = 0;
        LifecycleOwner lifecycleOwner = this.LJLILLLLZI;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
        Handler handler = (Handler) this.LJLJJL.getValue();
        if (handler.hasMessages(101)) {
            return;
        }
        handler.removeMessages(101);
        handler.sendEmptyMessageDelayed(101, 4000L);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onStart() {
        Handler handler = (Handler) this.LJLJJL.getValue();
        if (handler.hasMessages(101)) {
            return;
        }
        handler.removeMessages(101);
        handler.sendEmptyMessageDelayed(101, 4000L);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        ((Handler) this.LJLJJL.getValue()).removeCallbacksAndMessages(null);
    }

    public final void LIZ(int i, boolean z) {
        if (i >= 0 && i < this.LJLJI.size()) {
            String trendingName = ((TrendingEventModel) ListProtector.get(this.LJLJI, i)).getTrendingName();
            if (z) {
                this.LJLIL.setText(trendingName);
            } else {
                this.LJLIL.setCurrentText(trendingName);
            }
            InterfaceC88471Ynr<String, Integer, C76800UCe> interfaceC88471Ynr = this.LJLJJI;
            if (interfaceC88471Ynr != null) {
                if (trendingName == null) {
                    trendingName = "";
                }
                interfaceC88471Ynr.invoke(trendingName, Integer.valueOf(i));
            }
        }
    }

    public final void LIZIZ(int i, boolean z) {
        String str;
        TrendingEventModel trendingEventModel;
        int i2 = 0;
        if (i >= 0 && i < ((ArrayList) this.LJLJLJ).size()) {
            Object obj = ListProtector.get(this.LJLJLJ, i);
            Iterator<TrendingEventModel> it = this.LJLJI.iterator();
            while (true) {
                str = null;
                if (it.hasNext()) {
                    trendingEventModel = it.next();
                    if (o.LJ(trendingEventModel.getEventId(), obj)) {
                        break;
                    }
                } else {
                    trendingEventModel = null;
                    break;
                }
            }
            TrendingEventModel trendingEventModel2 = trendingEventModel;
            if (trendingEventModel2 != null) {
                str = trendingEventModel2.getTrendingName();
            }
            if (z) {
                this.LJLIL.setText(str);
            } else {
                this.LJLIL.setCurrentText(str);
            }
            InterfaceC88471Ynr<String, Integer, C76800UCe> interfaceC88471Ynr = this.LJLJJI;
            if (interfaceC88471Ynr != null) {
                if (str == null) {
                    str = "";
                }
                Iterator<TrendingEventModel> it2 = this.LJLJI.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (o.LJ(it2.next().getEventId(), obj)) {
                            break;
                        } else {
                            i2++;
                        }
                    } else {
                        i2 = -1;
                        break;
                    }
                }
                interfaceC88471Ynr.invoke(str, Integer.valueOf(i2));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TrendingTitleSwitcher(TextSwitcher textSwitcher, LifecycleOwner lifecycleOwner, List<TrendingEventModel> trendingListData, InterfaceC88471Ynr<? super String, ? super Integer, C76800UCe> interfaceC88471Ynr) {
        o.LJIIIZ(trendingListData, "trendingListData");
        this.LJLIL = textSwitcher;
        this.LJLILLLLZI = lifecycleOwner;
        this.LJLJI = trendingListData;
        this.LJLJJI = interfaceC88471Ynr;
        this.LJLJJL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 665));
        ArrayList arrayList = new ArrayList(C32I.LJJL(trendingListData, 10));
        Iterator<TrendingEventModel> it = trendingListData.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getEventId());
        }
        this.LJLJL = arrayList;
        this.LJLJLJ = new ArrayList();
        this.LJLJLLL = new HashSet<>();
    }
}
