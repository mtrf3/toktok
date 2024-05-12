package com.bytedance.android.livesdk.widget;

import X.ActivityC45651qj;
import X.B4W;
import X.B53;
import X.BM1;
import X.C16880lQ;
import X.C28701BOf;
import X.C28703BOh;
import X.C29162BcU;
import X.C29401Dk;
import X.C30868C9o;
import X.C45804HyK;
import X.C5H3;
import X.C73318Sq2;
import X.C73943T0h;
import X.C78996UzQ;
import X.C79004UzY;
import X.CH1;
import X.CN1;
import X.HandlerC28345BAn;
import X.InterfaceC28344BAm;
import Y.AfS57S0100000_5;
import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.CoverImageModel;
import com.bytedance.android.livesdk.watch.DetectReportDialog;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.debug.GetQuestionnaireContentResponse;
import com.bytedance.android.livesdkapi.depend.model.live.debug.Question;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveDetectInfoView extends LiveRecyclableWidget implements View.OnClickListener, InterfaceC28344BAm {
    public TextView LJLIL;
    public TextView LJLILLLLZI;
    public CoverImageModel LJLJJI;
    public final String LJLJI = "LiveDetectInfoView";
    public final C73318Sq2 LJLJJL = new C73318Sq2();
    public final C5H3 LJLJJLL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 275));

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.ddx;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final HandlerC28345BAn LJLZ() {
        return (HandlerC28345BAn) this.LJLJJLL.getValue();
    }

    public final void LJZI() {
        CoverImageModel coverImageModel;
        Context context;
        ActivityC45651qj LJJIFFI;
        FragmentManager supportFragmentManager;
        List<Question> list = B53.LJII;
        if (list == null || list.isEmpty() || (coverImageModel = this.LJLJJI) == null || TextUtils.isEmpty(coverImageModel.uri)) {
            return;
        }
        CoverImageModel coverImageModel2 = this.LJLJJI;
        List<String> list2 = null;
        if (coverImageModel2 == null || coverImageModel2.urlList == null) {
            return;
        }
        if (coverImageModel2 != null) {
            list2 = coverImageModel2.urlList;
        }
        if (C79004UzY.LJJIFFI(B53.LJII) || C79004UzY.LJJIFFI(list2) || (context = this.context) == null || (LJJIFFI = C45804HyK.LJJIFFI(context)) == null || (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) == null) {
            return;
        }
        DetectReportDialog detectReportDialog = new DetectReportDialog();
        List<Question> list3 = B53.LJII;
        CoverImageModel coverImageModel3 = this.LJLJJI;
        detectReportDialog.LJLJJL = list3;
        detectReportDialog.LJLJJLL = coverImageModel3;
        C28703BOh c28703BOh = detectReportDialog.LJLJJI;
        if (c28703BOh != null) {
            c28703BOh.LJLIL = list3;
            c28703BOh.LJLJI = coverImageModel3;
            c28703BOh.notifyDataSetChanged();
        }
        detectReportDialog.show(supportFragmentManager, this.LJLJI);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        this.LJLJJL.LIZLLL();
        ((IHostWatch) CN1.LIZ(IHostWatch.class)).removeScreenShotListener();
        LJLZ().removeCallbacksAndMessages(null);
        this.LJLJJI = null;
    }

    public final void LJZ(boolean z) {
        if (B53.LIZLLL == 0) {
            TextView textView = this.LJLIL;
            if (textView != null) {
                textView.setText(R.string.kqj);
                TextView textView2 = this.LJLILLLLZI;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    if (z) {
                        Set<Long> set = B53.LJFF;
                        set.clear();
                        C29162BcU.LJFF(LJLZ(), B4W.LIZIZ(), 0, set.size());
                    }
                    B4W.LIZ(BM1.LIZLLL);
                    return;
                }
                o.LJIJI("detectionReportTv");
                throw null;
            }
            o.LJIJI("detectionStateTv");
            throw null;
        }
        TextView textView3 = this.LJLIL;
        if (textView3 != null) {
            textView3.setText(R.string.kqr);
            TextView textView4 = this.LJLILLLLZI;
            if (textView4 != null) {
                textView4.setVisibility(8);
                if (!z) {
                    return;
                }
                C29162BcU.LJFF(LJLZ(), B4W.LIZIZ(), 1, B53.LJFF.size());
                return;
            }
            o.LJIJI("detectionReportTv");
            throw null;
        }
        o.LJIJI("detectionStateTv");
        throw null;
    }

    @Override // X.InterfaceC28344BAm
    public final void handleMsg(Message message) {
        Integer valueOf;
        if (message == null || (valueOf = Integer.valueOf(message.what)) == null) {
            return;
        }
        if (valueOf.intValue() == 48) {
            Object obj = message.obj;
            if (obj == null || !(obj instanceof GetQuestionnaireContentResponse)) {
                return;
            }
            o.LJII(obj, "null cannot be cast to non-null type com.bytedance.android.livesdkapi.depend.model.live.debug.GetQuestionnaireContentResponse");
            B53.LJII = ((GetQuestionnaireContentResponse) obj).getQuestions();
            LJZI();
            return;
        }
        if (valueOf.intValue() != 51) {
            return;
        }
        Object obj2 = message.obj;
        if (obj2 != null) {
            if (obj2 instanceof CoverImageModel) {
                o.LJII(obj2, "null cannot be cast to non-null type com.bytedance.android.live.base.model.user.CoverImageModel");
                this.LJLJJI = (CoverImageModel) obj2;
                LJZI();
                return;
            } else if (obj2 instanceof CH1) {
                C29401Dk c29401Dk = (C29401Dk) obj2;
                if (!TextUtils.isEmpty(c29401Dk.getPrompt())) {
                    C30868C9o.LJI(c29401Dk.getPrompt());
                    return;
                }
            }
        }
        C30868C9o.LJI("upload image fail,please try again");
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r14) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widget.LiveDetectInfoView.onClick(android.view.View):void");
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        if (objArr != null && objArr.length != 0) {
            Object obj = objArr[0];
            if (obj instanceof Room) {
                o.LJII(obj, "null cannot be cast to non-null type com.bytedance.android.livesdkapi.depend.model.live.Room");
                if (Room.isValid((Room) obj)) {
                    o.LJII(objArr[0], "null cannot be cast to non-null type com.bytedance.android.livesdkapi.depend.model.live.Room");
                }
            }
        }
        View findViewById = findViewById(R.id.m55);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.tv_detection_state)");
        this.LJLIL = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.m54);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.tv_detection_report)");
        this.LJLILLLLZI = (TextView) findViewById2;
        TextView textView = this.LJLIL;
        if (textView != null) {
            C16880lQ.LJIJI(textView, this);
            TextView textView2 = this.LJLILLLLZI;
            if (textView2 != null) {
                C16880lQ.LJIJI(textView2, this);
                TextView textView3 = this.LJLILLLLZI;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                    LJZ(false);
                    ((IHostWatch) CN1.LIZ(IHostWatch.class)).addScreenShotListener();
                    this.LJLJJL.LIZ(C73943T0h.LIZ().LJ(C28701BOf.class).LJJJJZI(new AfS57S0100000_5(this, 168)));
                    if (B53.LJII != null) {
                        return;
                    }
                    C29162BcU.LIZLLL(LJLZ());
                    return;
                }
                o.LJIJI("detectionReportTv");
                throw null;
            }
            o.LJIJI("detectionReportTv");
            throw null;
        }
        o.LJIJI("detectionStateTv");
        throw null;
    }
}
