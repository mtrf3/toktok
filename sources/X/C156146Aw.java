package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.ss.android.ugc.gamora.editor.EditCommentStickerState;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6Aw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C156146Aw extends C6DB {
    public final C82622Wbi LJIILIIL;
    public final boolean LJIILJJIL;
    public final ActivityC45651qj LJIILL;
    public C63K LJIILLIIL;
    public final C62822Ol8 LJIIZILJ;
    public final C62822Ol8 LJIJ;
    public InterfaceC92693kP LJIJI;
    public boolean LJIJJ;

    @Override // X.C6DB, X.C6DA
    public final View LJFF() {
        boolean z;
        int i;
        ViewGroup viewGroup = (ViewGroup) super.LJFF();
        final boolean z2 = this.LJIJJ;
        final C63K c63k = this.LJIILLIIL;
        if (c63k == null) {
            return viewGroup;
        }
        boolean LJIJJLI = c63k.LJIJJLI();
        if (C6FR.LIZ()) {
            View view = this.LIZ;
            o.LJII(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.editSticker.text.view.TextStickerView");
            String text = ((C67P) view).getText();
            o.LJIIIIZZ(text, "contentView as TextStickerView).text");
            boolean z3 = false;
            if (text.length() <= 150) {
                List list = null;
                try {
                    String[] strArr = (String[]) SettingsManager.LIZLLL().LJIIIIZZ("qa_sticker_regular", String[].class, null);
                    if (strArr != null) {
                        list = ORY.LJJZZIII(strArr);
                    }
                } catch (Throwable unused) {
                }
                if (list == null || list.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    list = C47261Igj.LJJIJIIJI("^why .*", "^what .*", "^when .*", "^where .*", "^who .*", "^how .*", ".*could you .*", ".*can you .*", ".*would you .*");
                }
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String str = (String) it.next();
                    Locale US = Locale.US;
                    o.LJIIIIZZ(US, "US");
                    String lowerCase = text.toLowerCase(US);
                    o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    if (Pattern.matches(str, lowerCase)) {
                        z3 = true;
                        break;
                    }
                }
            }
            if (z3 && !AnonymousClass699.LIZIZ().LJ && !AnonymousClass699.LIZIZ().LJII && this.LJIILJJIL && C1B8.LIZJ() && !z2 && !LJIJJLI) {
                c63k.Fw();
                if (C90193gN.LIZ()) {
                    i = R.drawable.u7;
                } else {
                    i = R.drawable.u6;
                }
                LinearLayout LIZIZ = LIZIZ(i, R.string.pmi);
                C16880lQ.LJIIZILJ(LIZIZ, new View.OnClickListener() { // from class: X.6Ax
                    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
                    
                        if (r13 == null) goto L32;
                     */
                    @Override // android.view.View.OnClickListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void onClick(android.view.View r29) {
                        /*
                            r28 = this;
                            r2 = r28
                            X.63K r0 = X.C63K.this
                            r0.show()
                            X.63K r0 = X.C63K.this
                            boolean r0 = r0.LJIJJLI()
                            if (r0 != 0) goto L13
                            boolean r0 = r2
                            if (r0 == 0) goto L24
                        L13:
                            X.6Aw r0 = r3
                            android.content.Context r0 = r0.LJ
                            X.C3AW.LIZ(r0)
                        L1a:
                            X.6Aw r0 = r3
                            X.6GI r0 = r0.LIZIZ
                            if (r0 == 0) goto L23
                            r0.LJIIJ()
                        L23:
                            return
                        L24:
                            X.6Aw r5 = r3
                            android.view.View r4 = r5.LIZ
                            boolean r0 = r4 instanceof X.C67P
                            r15 = 0
                            if (r0 == 0) goto L1a
                            X.67P r4 = (X.C67P) r4
                            if (r4 == 0) goto L1a
                            X.63K r1 = X.C63K.this
                            r5.LJ()
                            X.Wbi r3 = r5.LJIILIIL
                            if (r3 == 0) goto La8
                        L3a:
                            java.lang.Class<X.5iZ> r0 = X.InterfaceC142515iZ.class
                            java.lang.Object r0 = r3.LJIIIIZZ(r15, r0)
                            X.5iZ r0 = (X.InterfaceC142515iZ) r0
                            if (r0 == 0) goto L55
                            X.0IB r0 = r0.PI()
                            if (r0 == 0) goto L55
                            java.lang.Object r0 = r0.LIZ()
                            X.63D r0 = (X.C63D) r0
                            if (r0 == 0) goto L55
                            r0.Mj(r4)
                        L55:
                            X.Hc3 r3 = X.C73098SmU.LJ()
                            com.ss.android.ugc.aweme.sticker.data.QaStruct r5 = new com.ss.android.ugc.aweme.sticker.data.QaStruct
                            r6 = 0
                            if (r3 == 0) goto La5
                            java.lang.String r0 = r3.getUid()
                            if (r0 == 0) goto La5
                            long r8 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)
                        L69:
                            if (r3 == 0) goto La3
                            com.ss.android.ugc.aweme.base.model.UrlModel r12 = r3.getAvatarThumb()
                            java.lang.String r13 = r3.LJ()
                            if (r13 != 0) goto L77
                        L75:
                            java.lang.String r13 = ""
                        L77:
                            java.lang.String r14 = r4.getText()
                            if (r3 == 0) goto L81
                            java.lang.String r15 = r3.getSecUid()
                        L81:
                            r16 = 0
                            X.Vy6 r17 = X.EnumC81462Vy6.TextToQuestion
                            r23 = 0
                            r26 = 130693(0x1fe85, float:1.8314E-40)
                            r10 = r6
                            r18 = r16
                            r19 = r16
                            r20 = r16
                            r21 = r16
                            r22 = r16
                            r24 = r16
                            r25 = r16
                            r27 = r16
                            r5.<init>(r6, r8, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
                            r1.I4(r5)
                            goto L1a
                        La3:
                            r12 = r15
                            goto L75
                        La5:
                            r8 = 0
                            goto L69
                        La8:
                            X.Ol8 r0 = r5.LJIJ
                            java.lang.Object r0 = r0.getValue()
                            X.WMH r0 = (X.WMH) r0
                            X.Wbi r3 = X.C44384HbQ.LJJLIIIJJI(r0)
                            if (r3 == 0) goto L55
                            goto L3a
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC156156Ax.onClick(android.view.View):void");
                    }
                });
                if (viewGroup.getChildCount() == 0) {
                    viewGroup.addView(LIZIZ);
                } else {
                    viewGroup.addView(LIZIZ, viewGroup.getChildCount() - 1);
                    viewGroup.addView(LIZJ(), viewGroup.getChildCount() - 1);
                }
            }
        }
        LJIIJJI(this.LJIIIIZZ + 1);
        return viewGroup;
    }

    @Override // X.C6DA
    public final void LJIIIZ() {
        super.LJIIIZ();
        BaseJediViewModel commentStickerViewModel = (BaseJediViewModel) this.LJIIZILJ.getValue();
        o.LJIIIIZZ(commentStickerViewModel, "commentStickerViewModel");
        this.LJIJI = BaseJediViewModel.Jv0(commentStickerViewModel, (WM7) this.LJIJ.getValue(), new TBT() { // from class: X.6Ay
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((EditCommentStickerState) obj).getHasCommentSticker();
            }
        }, new AqS168S0100000_2(this, 412));
    }

    @Override // X.C6DA
    public final void LJIIJ() {
        super.LJIIJ();
        InterfaceC92693kP interfaceC92693kP = this.LJIJI;
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        } else {
            o.LJIJI("commentDisposable");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C156146Aw(View contentView, C1552567l c1552567l, C82622Wbi c82622Wbi) {
        super(contentView, c1552567l);
        o.LJIIIZ(contentView, "contentView");
        this.LJIILIIL = c82622Wbi;
        this.LJIILJJIL = C6IG.LIZIZ(C6IE.EDIT_PAGE_PANEL);
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(this.LJ);
        if (LJJIFFI != null) {
            this.LJIILL = LJJIFFI;
            this.LJIIZILJ = C221108m2.LIZIZ(new AqS149S0200000_2(contentView, this, 72));
            this.LJIJ = C221108m2.LIZIZ(new AqS152S0100000_2(contentView, 704));
            this.LJIILLIIL = c82622Wbi != null ? (C63K) c82622Wbi.LJIIIIZZ(null, C63K.class) : null;
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
