package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.GifContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.NudgeContent;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import kotlin.jvm.internal.AqS132S0200000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4AP, reason: invalid class name */
/* loaded from: classes2.dex */
public class C4AP extends AnonymousClass460<NudgeContent> {
    public static final int LLIIJLIL = (int) KL2.LIZJ(EF7.LIZIZ(), 112.0f);
    public static final int LLIIL = (int) KL2.LIZJ(EF7.LIZIZ(), 300.0f);
    public static final int LLIILII = (int) KL2.LIZJ(EF7.LIZIZ(), 180.0f);
    public final View LLIIIL;
    public final C62846OlW LLIIIZ;
    public final ConstraintLayout LLIIJI;

    @Override // X.AnonymousClass460, X.AbstractC1041546x
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C109544Rq c109544Rq = this.LJZI;
        if (c109544Rq != null) {
            long j = 0;
            if (s0((NudgeContent) this.LLIIIILZ)) {
                GifContent gifContent = (GifContent) this.LLIIIILZ;
                if (gifContent != null) {
                    j = gifContent.getImageId();
                }
                C4FC.LIZ(j, new C105034Ah(j, false, new AqS132S0200000_1(this, c109544Rq, 56)));
                return;
            }
            GifContent gifContent2 = (GifContent) this.LLIIIILZ;
            if (gifContent2 != null) {
                j = gifContent2.getImageId();
            }
            C4FC.LIZ(j, new C105034Ah(j, true, new AqS132S0200000_1(this, c109544Rq, 56)));
        }
    }

    public static boolean s0(NudgeContent nudgeContent) {
        String str;
        String str2 = null;
        if (nudgeContent != null) {
            str = nudgeContent.getImageType();
        } else {
            str = null;
        }
        if (!C60903NvH.LJIJI(str)) {
            if (nudgeContent != null) {
                str2 = nudgeContent.getImageType();
            }
            if (!C60903NvH.LJIJJLI(str2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4AP(View itemView, EnumC110124Tw messageType) {
        super(itemView, messageType);
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(messageType, "messageType");
        View findViewById = itemView.findViewById(R.id.btt);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.content_layout)");
        this.LLIIIL = findViewById;
        View findViewById2 = itemView.findViewById(R.id.hpc);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.picture_iv)");
        this.LLIIIZ = (C62846OlW) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.hr4);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.placeholder_container)");
        this.LLIIJI = (ConstraintLayout) findViewById3;
    }

    @Override // X.AbstractC1041546x
    public final void N(C49V c49v, C109544Rq msg, C109544Rq c109544Rq, C109544Rq c109544Rq2) {
        V92 hierarchy;
        o.LJIIIZ(msg, "msg");
        if (C4LS.LIZIZ()) {
            Context context = this.LLIIIZ.getContext();
            o.LJIIIIZZ(context, "pictureIv.context");
            Integer LJI = C79045V0n.LJI(R.attr.cv, context);
            if (LJI != null) {
                int intValue = LJI.intValue();
                View view = this.LLIIIL;
                GradientDrawable gradientDrawable = new GradientDrawable();
                C77413UZt.LJFF(gradientDrawable, new C49V(c49v.LIZ, c49v.LIZIZ, new C48E(intValue)));
                view.setBackground(gradientDrawable);
                return;
            }
            return;
        }
        Context context2 = this.LLIIIZ.getContext();
        o.LJIIIIZZ(context2, "pictureIv.context");
        Integer LJI2 = C79045V0n.LJI(C49R.LIZ.LIZLLL, context2);
        if (LJI2 != null) {
            this.LLIIIZ.setBackgroundColor(LJI2.intValue());
        }
        CONTENT content = this.LLIIIILZ;
        boolean z = true;
        if (content == 0 || (content.type != 502 && content.type != 503)) {
            z = false;
        }
        if (z) {
            C4AH c4ah = c49v.LIZ;
            if (c4ah != null) {
                Context context3 = this.itemView.getContext();
                o.LJIIIIZZ(context3, "itemView.context");
                V8L LJJJI = g0.LJJJI(c4ah, context3);
                if (LJJJI == null || (hierarchy = this.LLIIIZ.getHierarchy()) == null) {
                    return;
                }
                hierarchy.LJIL(LJJJI);
                return;
            }
            return;
        }
        V92 hierarchy2 = this.LLIIIZ.getHierarchy();
        if (hierarchy2 == null) {
            return;
        }
        hierarchy2.LJIL(null);
    }

    @Override // X.AnonymousClass460
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public void p0(C109544Rq msg, C109544Rq c109544Rq, NudgeContent nudgeContent, int i) {
        o.LJIIIZ(msg, "msg");
        AnonymousClass470 anonymousClass470 = this.LJLJJI;
        if (anonymousClass470 != null) {
            anonymousClass470.LIZIZ(50331648, 10);
        }
        CONTENT content = this.LLIIIILZ;
        int i2 = 1;
        if (content != 0 && (content.type == 500 || content.type == 501)) {
            this.LLIIIZ.getHierarchy().LJIILL(null, 1);
        } else {
            this.LLIIIZ.getHierarchy().LJIJ(R.drawable.bjg);
        }
        C62846OlW c62846OlW = this.LLIIIZ;
        if (!C4FU.LJ()) {
            i2 = -1;
        }
        c62846OlW.setScaleX(i2 * 1.0f);
    }
}
