package com.ss.android.ugc.aweme.comment.widgets;

import X.C174366sq;
import X.C207668Da;
import X.OSZ;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class BaseCommentWidget extends Widget implements Observer {
    public Aweme LJLJLJ;
    public C174366sq LJLJLLL;

    public void LJIIZILJ() {
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final Aweme LJIILJJIL() {
        Aweme aweme = this.LJLJLJ;
        if (aweme != null) {
            return aweme;
        }
        o.LJIJI("aweme");
        throw null;
    }

    public final String LJIILL() {
        C174366sq c174366sq = this.LJLJLLL;
        if (c174366sq != null) {
            String enterFrom = c174366sq.getEnterFrom();
            o.LJIIIIZZ(enterFrom, "params.enterFrom");
            return enterFrom;
        }
        return "";
    }

    public final String LJIILLIIL() {
        C174366sq c174366sq = this.LJLJLLL;
        if (c174366sq != null) {
            String eventType = c174366sq.getEventType();
            o.LJIIIIZZ(eventType, "params.eventType");
            return eventType;
        }
        return "";
    }

    public final boolean LJIJ() {
        if (this.LJLJLJ != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onCreate() {
        super.onCreate();
        LJIIZILJ();
        DataCenter dataCenter = this.LJLJJI;
        dataCenter.iv0("comment_visible", this, true);
        dataCenter.iv0("comment_aweme_and_params", this, true);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onDestroy() {
        super.onDestroy();
        this.LJLJJI.kv0(this);
    }

    public static void LJIJJ(View... viewArr) {
        for (View view : viewArr) {
            view.setVisibility(8);
        }
    }

    public static void LJIJJLI(View... viewArr) {
        for (View view : viewArr) {
            view.setVisibility(0);
        }
    }

    @Override // androidx.lifecycle.Observer
    /* renamed from: LJIJI, reason: merged with bridge method [inline-methods] */
    public void onChanged(C207668Da c207668Da) {
        Aweme aweme;
        C174366sq c174366sq;
        if (c207668Da == null) {
            return;
        }
        String str = c207668Da.LIZ;
        int hashCode = str.hashCode();
        Object obj = null;
        if (hashCode != 278836882) {
            if (hashCode != 2016314694 || !str.equals("comment_aweme_and_params")) {
                return;
            }
            Object obj2 = c207668Da.LIZIZ;
            if (obj2 == null) {
                obj2 = null;
            }
            OSZ osz = (OSZ) obj2;
            if (osz == null || (aweme = (Aweme) osz.getFirst()) == null) {
                return;
            }
            this.LJLJLJ = aweme;
            Object obj3 = c207668Da.LIZIZ;
            if (obj3 != null) {
                obj = obj3;
            }
            OSZ osz2 = (OSZ) obj;
            if (osz2 == null || (c174366sq = (C174366sq) osz2.getSecond()) == null) {
                return;
            }
            this.LJLJLLL = c174366sq;
            return;
        }
        if (!str.equals("comment_visible")) {
            return;
        }
        Object obj4 = c207668Da.LIZIZ;
        if (obj4 != null) {
            obj = obj4;
        }
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            return;
        }
        bool.booleanValue();
    }
}
