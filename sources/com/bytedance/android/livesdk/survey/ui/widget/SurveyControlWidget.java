package com.bytedance.android.livesdk.survey.ui.widget;

import X.ActivityC45651qj;
import X.C29306Beo;
import X.C30326BvG;
import X.C78130UlS;
import X.C78135UlX;
import X.C87856Ydw;
import X.EnumC78138Ula;
import X.EnumC78147Ulj;
import X.InterfaceC78129UlR;
import Y.ARunnableS49S0100000_13;
import android.content.Context;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.livesdk.survey.model.SurveyData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS195S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class SurveyControlWidget extends LiveWidget implements InterfaceC78129UlR {
    public C78130UlS LJLIL;
    public C78135UlX LJLILLLLZI;
    public Room LJLJI;
    public final SurveyControlWidget$mActivityLifecycleObserver$1 LJLJJI = new GenericLifecycleObserver() { // from class: com.bytedance.android.livesdk.survey.ui.widget.SurveyControlWidget$mActivityLifecycleObserver$1
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_STOP) {
                onActivityStop();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
        public final void onActivityStop() {
            C87856Ydw c87856Ydw;
            C78135UlX c78135UlX = SurveyControlWidget.this.LJLILLLLZI;
            if (c78135UlX != null && (c87856Ydw = c78135UlX.LJLJI) != null) {
                EnumC78147Ulj enumC78147Ulj = c87856Ydw.LJIIJJI;
                if (enumC78147Ulj == EnumC78147Ulj.QUESTION || enumC78147Ulj == EnumC78147Ulj.FEEDBACK) {
                    c87856Ydw.LIZ(EnumC78138Ula.CANCEL);
                }
            }
        }
    };
    public final AqS195S0100000_13 LJLJJL = new AqS195S0100000_13(this, 21);
    public final AqS163S0100000_13 LJLJJLL = new AqS163S0100000_13(this, 235);

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC78133UlV
    public final void LJJJZ() {
        C78130UlS c78130UlS = this.LJLIL;
        if (c78130UlS != null) {
            c78130UlS.LJJJZ();
        } else {
            o.LJIJI("mViewProxy");
            throw null;
        }
    }

    @Override // X.InterfaceC78133UlV
    public final void LJJLI() {
        C78130UlS c78130UlS = this.LJLIL;
        if (c78130UlS != null) {
            c78130UlS.LJJLI();
        } else {
            o.LJIJI("mViewProxy");
            throw null;
        }
    }

    @Override // X.InterfaceC78133UlV
    public final void LJJLIL() {
        C78130UlS c78130UlS = this.LJLIL;
        if (c78130UlS != null) {
            c78130UlS.LJJLIL();
        } else {
            o.LJIJI("mViewProxy");
            throw null;
        }
    }

    @Override // X.InterfaceC78133UlV
    public final void LJJZZI() {
        C78130UlS c78130UlS = this.LJLIL;
        if (c78130UlS != null) {
            c78130UlS.LJJZZI();
        } else {
            o.LJIJI("mViewProxy");
            throw null;
        }
    }

    @Override // X.InterfaceC31336CRo
    public final String getLogTag() {
        return SurveyControlWidget.class.getName();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        C30326BvG.LIZ.post(new ARunnableS49S0100000_13(this, 73), this.dataChannel);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        ActivityC45651qj LIZIZ;
        Lifecycle lifecycle;
        super.onDestroy();
        C78135UlX c78135UlX = this.LJLILLLLZI;
        if (c78135UlX != null) {
            C87856Ydw c87856Ydw = c78135UlX.LJLJI;
            if (c87856Ydw != null) {
                c87856Ydw.LJFF();
            }
            c78135UlX.LJLIL.dispose();
        }
        C78135UlX c78135UlX2 = this.LJLILLLLZI;
        if (c78135UlX2 != null) {
            c78135UlX2.detachView();
        }
        Context context = this.context;
        if (context != null && (LIZIZ = C29306Beo.LIZIZ(context)) != null && (lifecycle = LIZIZ.getLifecycle()) != null) {
            lifecycle.removeObserver(this.LJLJJI);
        }
    }

    @Override // X.InterfaceC78133UlV
    public final void LJJJ(SurveyData surveyData) {
        C78130UlS c78130UlS = this.LJLIL;
        if (c78130UlS != null) {
            c78130UlS.LJJJ(surveyData);
        } else {
            o.LJIJI("mViewProxy");
            throw null;
        }
    }
}
