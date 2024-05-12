package X;

import android.app.Activity;
import android.content.Intent;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HUE extends AbstractBinderC44127HTn {
    public final AIGCPictureHandler LJLILLLLZI;

    @Override // X.AbstractBinderC44127HTn
    public final String LIZIZ() {
        return "aigc_take_selfie";
    }

    @Override // X.AbstractBinderC44127HTn
    public final void LIZLLL(Activity activity, Intent intent) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.AbstractBinderC44127HTn
    public final void LJ() {
        C72413SbR.LIZ("retake");
    }

    @Override // X.AbstractBinderC44127HTn
    public final void LJFF() {
        C72413SbR.LIZ("show");
    }

    public HUE(AIGCPictureHandler handler) {
        o.LJIIIZ(handler, "handler");
        this.LJLILLLLZI = handler;
    }

    @Override // X.AbstractBinderC44127HTn
    public final void LIZJ(Activity activity, String returnLocalUrl, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(returnLocalUrl, "returnLocalUrl");
        this.LJLILLLLZI.checkValidAndUpload(activity, C47261Igj.LJJIJ(returnLocalUrl), "shoot_page", new AqS167S0100000_1(interfaceC88472Yns, (InterfaceC88472Yns<? super FrameLayout, C76800UCe>) 407));
        C72413SbR.LIZ("use_photo");
    }
}
