package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareUserContent;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.47r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1043547r extends AnonymousClass460<ShareUserContent> {
    public final View LLIIIL;
    public final SmartImageView LLIIIZ;
    public final TuxTextView LLIIJI;
    public final TuxTextView LLIIJLIL;
    public final TextView LLIIL;
    public final C62822Ol8 LLIILII;
    public final C62822Ol8 LLIILZL;

    @Override // X.AnonymousClass460
    public final void o0() {
        AnonymousClass470 anonymousClass470;
        View view;
        int m0 = m0();
        if (m0 > 0 && (anonymousClass470 = this.LJLJJI) != null && (view = anonymousClass470.LIZ) != null) {
            AnonymousClass636.LJIJ(view, Integer.valueOf(m0), null, 2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1043547r(View itemView, EnumC110124Tw type) {
        super(itemView, type);
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(type, "type");
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(C1043647s.LJLIL);
        this.LLIILII = LIZIZ;
        C62822Ol8 LIZIZ2 = C221108m2.LIZIZ(new AqS151S0100000_1(itemView, 810));
        this.LLIILZL = LIZIZ2;
        View findViewById = itemView.findViewById(R.id.btt);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.content_layout)");
        this.LLIIIL = findViewById;
        View findViewById2 = itemView.findViewById(R.id.ebu);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.icon_iv)");
        SmartImageView smartImageView = (SmartImageView) findViewById2;
        this.LLIIIZ = smartImageView;
        View findViewById3 = itemView.findViewById(R.id.lao);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.title_tv)");
        this.LLIIJI = (TuxTextView) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.c7z);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.desc_tv)");
        this.LLIIJLIL = (TuxTextView) findViewById4;
        View findViewById5 = itemView.findViewById(R.id.l0i);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.tag_tv)");
        this.LLIIL = (TextView) findViewById5;
        if (((Boolean) LIZIZ.getValue()).booleanValue()) {
            smartImageView.getHierarchy().LJIILL((Drawable) LIZIZ2.getValue(), 1);
        } else {
            smartImageView.getHierarchy().LJIJ(R.drawable.bia);
        }
        V8L v8l = new V8L();
        v8l.LIZIZ = true;
        smartImageView.getHierarchy().LJIL(v8l);
        int dimensionPixelSize = this.itemView.getResources().getDimensionPixelSize(R.dimen.ty);
        smartImageView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }

    public final void t0(String str, UrlModel urlModel) {
        W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
        if (((Boolean) this.LLIILII.getValue()).booleanValue()) {
            LJII.LJIILIIL = (Drawable) this.LLIILZL.getValue();
            LJII.LJIILLIIL = (Drawable) this.LLIILZL.getValue();
        } else {
            LJII.LJIIJJI = R.drawable.bia;
            LJII.LJIILL = R.drawable.bia;
        }
        LJII.LJIJJLI = C43659HBn.LJIIL();
        LJII.LJJIII = EnumC62195Ob1.SMALL;
        LJII.LJJIIJ = this.LLIIIZ;
        C43659HBn.LJIIZILJ(LJII, "ShareUserSimpleReceiveViewHolder", str, 0, null, 28);
    }

    @Override // X.AbstractC1041546x
    public final void N(C49V c49v, C109544Rq msg, C109544Rq c109544Rq, C109544Rq c109544Rq2) {
        o.LJIIIZ(msg, "msg");
        View view = this.LLIIIL;
        GradientDrawable gradientDrawable = new GradientDrawable();
        C77413UZt.LJFF(gradientDrawable, c49v);
        view.setBackground(gradientDrawable);
    }

    @Override // X.AnonymousClass460
    public final void p0(C109544Rq msg, C109544Rq c109544Rq, ShareUserContent shareUserContent, int i) {
        final ShareUserContent shareUserContent2 = shareUserContent;
        o.LJIIIZ(msg, "msg");
        AnonymousClass470 anonymousClass470 = this.LJLJJI;
        if (anonymousClass470 != null) {
            anonymousClass470.LIZIZ(50331648, 21);
        }
        if (shareUserContent2 == null) {
            return;
        }
        IMUser LJFF = C80533Eb.LJFF(shareUserContent2.getUid(), shareUserContent2.getSecUid());
        C80533Eb.LIZ.getClass();
        final boolean z = !ORZ.LJLJJI(shareUserContent2.getUid(), C80533Eb.LIZJ());
        if (LJFF != null) {
            if (z) {
                s0(shareUserContent2, LJFF.getNickName(), LJFF.getUniqueId(), LJFF.getAvatarThumb(), LJFF.isBlocked());
            } else {
                s0(shareUserContent2, LJFF.getNickName(), LJFF.getUniqueId(), LJFF.getAvatarThumb(), LJFF.isBlocked());
                return;
            }
        } else {
            s0(shareUserContent2, shareUserContent2.getName(), shareUserContent2.getDesc(), shareUserContent2.getAvatar(), false);
        }
        C80533Eb.LJIIJJI(shareUserContent2.getUid(), shareUserContent2.getSecUid(), z, new C3EU() { // from class: X.3Qj
            @Override // X.C3EU
            public final void LIZ(IMUser result) {
                String uniqueId;
                o.LJIIIZ(result, "result");
                C1043547r c1043547r = C1043547r.this;
                ShareUserContent shareUserContent3 = shareUserContent2;
                String nickName = result.getNickName();
                if (result.isBlocked()) {
                    uniqueId = null;
                } else {
                    uniqueId = result.getUniqueId();
                }
                c1043547r.s0(shareUserContent3, nickName, uniqueId, result.getAvatarThumb(), result.isBlocked());
                if (z) {
                    C80533Eb.LIZ.getClass();
                    java.util.Set LIZJ = C80533Eb.LIZJ();
                    String uid = result.getUid();
                    o.LJIIIIZZ(uid, "result.uid");
                    LIZJ.add(uid);
                }
            }

            @Override // X.C3EU
            public final void LIZIZ(Throwable throwable) {
                o.LJIIIZ(throwable, "throwable");
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0029, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s0(com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareUserContent r5, java.lang.String r6, java.lang.String r7, com.ss.android.ugc.aweme.base.model.UrlModel r8, boolean r9) {
        /*
            r4 = this;
            com.bytedance.tux.input.TuxTextView r0 = r4.LLIIJI
            r0.setText(r6)
            r1 = 0
            r3 = 8
            if (r9 != 0) goto L40
            if (r7 == 0) goto L2b
            com.bytedance.tux.input.TuxTextView r1 = r4.LLIIJLIL
            r0 = 0
            r1.setVisibility(r0)
            com.bytedance.tux.input.TuxTextView r2 = r4.LLIIJLIL
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r0 = 64
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.setText(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L30
        L2b:
            com.bytedance.tux.input.TuxTextView r0 = r4.LLIIJLIL
            r0.setVisibility(r3)
        L30:
            android.widget.TextView r1 = r4.LLIIL
            r0 = 2131831517(0x7f112add, float:1.9296062E38)
            r1.setText(r0)
            java.lang.String r0 = r5.getUid()
            r4.t0(r0, r8)
        L3f:
            return
        L40:
            com.bytedance.tux.input.TuxTextView r0 = r4.LLIIJLIL
            r0.setVisibility(r3)
            java.lang.String r0 = r5.getUid()
            r4.t0(r0, r1)
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1043547r.s0(com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareUserContent, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.base.model.UrlModel, boolean):void");
    }
}
