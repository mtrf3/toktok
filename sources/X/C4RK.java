package X;

import android.view.View;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareLiveContent;
import kotlin.jvm.internal.o;

/* renamed from: X.4RK, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4RK implements View.OnAttachStateChangeListener {
    public final View LJLIL;
    public C109544Rq LJLILLLLZI;
    public ShareLiveContent LJLJI;
    public boolean LJLJJI;
    public final C62822Ol8 LJLJJL;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        o.LJIIIZ(v, "v");
    }

    public final void LIZ() {
        String str;
        String str2;
        String str3;
        ShareLiveContent shareLiveContent = this.LJLJI;
        if (shareLiveContent != null) {
            str = shareLiveContent.getRoomOwnerId();
        } else {
            str = null;
        }
        ShareLiveContent shareLiveContent2 = this.LJLJI;
        if (shareLiveContent2 != null) {
            str2 = shareLiveContent2.getRoomSecOwnerId();
        } else {
            str2 = null;
        }
        C96093pt.LIZIZ(str, str2);
        ShareLiveContent shareLiveContent3 = this.LJLJI;
        if (shareLiveContent3 != null) {
            str3 = shareLiveContent3.getRoomOwnerId();
        } else {
            str3 = null;
        }
        C84643Tw.LIZLLL(str3, "chat", "click_head", null, 24);
    }

    public C4RK(View itemView) {
        o.LJIIIZ(itemView, "itemView");
        this.LJLIL = itemView;
        this.LJLJJL = C221108m2.LIZIZ(C4RN.LJLIL);
        itemView.addOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        o.LJIIIZ(v, "v");
        ((C73318Sq2) this.LJLJJL.getValue()).LIZLLL();
    }
}
