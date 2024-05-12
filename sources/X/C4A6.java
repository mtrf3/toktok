package X;

import android.view.View;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.4A6, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4A6<CONTENT extends BaseContent> extends C4A4<CONTENT> {
    public final C62822Ol8 LLILIL;

    public final void z0() {
        if (!((Boolean) this.LLILIL.getValue()).booleanValue()) {
            this.LLIILII.setVisibility(0);
            this.LLIIL.setVisibility(8);
        }
        this.LLIIZ.setVisibility(8);
        this.LLIILZL.setText(R.string.hik);
        AnonymousClass470 anonymousClass470 = this.LJLJJI;
        if (anonymousClass470 != null) {
            anonymousClass470.LIZIZ(150994945, Boolean.TRUE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4A6(View itemView, EnumC110124Tw type) {
        super(itemView, type);
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(type, "type");
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(C4A8.LJLIL);
        this.LLILIL = LIZIZ;
        x0(R.raw.icon_2pt_link, ((Boolean) LIZIZ.getValue()).booleanValue());
    }

    @Override // X.AnonymousClass460
    public void p0(C109544Rq msg, C109544Rq c109544Rq, CONTENT content, int i) {
        o.LJIIIZ(msg, "msg");
        AnonymousClass470 anonymousClass470 = this.LJLJJI;
        if (anonymousClass470 != null) {
            anonymousClass470.LIZIZ(150994945, Boolean.FALSE);
        }
    }
}
