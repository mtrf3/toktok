package X;

import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS93S0101000_3;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes10.dex */
public final class MNV extends MMX<C56685MMn> implements View.OnClickListener {
    public static final /* synthetic */ int LJLLL = 0;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;

    public final TuxTextView c0() {
        return (TuxTextView) this.LJLLI.getValue();
    }

    public final L9N f0() {
        return (L9N) this.LJLLJ.getValue();
    }

    @Override // X.MMX
    public final void reportShowEvent() {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "notification_page");
        c188727au.LIZLLL(N().LJLIL, "message_number");
        FMX.LJIIL("show_follow_request", c188727au.LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MNV(View itemView) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS159S0100000_9(itemView, 879));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS159S0100000_9(itemView, 881));
        this.LJLL = C221108m2.LIZIZ(new AqS159S0100000_9(itemView, 883));
        this.LJLLI = C221108m2.LIZIZ(new AqS159S0100000_9(itemView, 882));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS159S0100000_9(itemView, 880));
        this.LJLLJ = C221108m2.LIZIZ(new AqS159S0100000_9(itemView, 884));
        if (C53341Kwb.LIZ()) {
            MVR.LIZ(itemView, MVP.CELL, 0.0f);
        } else {
            C56812MRk.LIZ(itemView);
        }
        C16880lQ.LJIIJ(this, itemView);
        if (((Boolean) C46604IQu.LIZIZ.getValue()).booleanValue()) {
            ((TuxIconView) LIZIZ.getValue()).setTintColorRes(R.attr.go);
        }
    }

    @Override // X.MMX
    public final void T(C96533qb c96533qb) {
        boolean z;
        Integer valueOf = Integer.valueOf(c96533qb.LIZ);
        if (valueOf.intValue() != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int intValue = valueOf.intValue();
            View view = this.itemView;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = intValue;
            view.setLayoutParams(layoutParams);
        }
        Integer valueOf2 = Integer.valueOf(c96533qb.LJ);
        if (valueOf2.intValue() != -1) {
            ((TuxTextView) this.LJLL.getValue()).setTuxFont(valueOf2.intValue());
        }
        Integer valueOf3 = Integer.valueOf(c96533qb.LJI);
        if (valueOf3.intValue() != -1) {
            c0().setTuxFont(valueOf3.intValue());
        }
        Integer valueOf4 = Integer.valueOf(c96533qb.LIZIZ);
        if (valueOf4.intValue() != -1) {
            int intValue2 = valueOf4.intValue();
            ((C71799SFv) this.LJLLILLLL.getValue()).setSize(intValue2);
            f0().setSize(intValue2);
        }
    }

    @Override // X.MMX
    public final void V(C56685MMn c56685MMn) {
        Object valueOf;
        Object valueOf2;
        final InterfaceC88472Yns aqS93S0101000_3;
        Object valueOf3;
        C56685MMn c56685MMn2 = c56685MMn;
        super.V(c56685MMn2);
        ((TextView) this.LJLJLLL.getValue()).setText(C77123UOp.LJJIIJ(c56685MMn2.LJLIL));
        if (((Boolean) C53349Kwj.LIZIZ.getValue()).booleanValue()) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                c0().setBreakStrategy(0);
            } else if (i >= 23) {
                c0().setBreakStrategy(0);
            }
            if (c56685MMn2.LJLIL == 1) {
                L9N vgAvatar = f0();
                o.LJIIIIZZ(vgAvatar, "vgAvatar");
                KL2.LJIILLIIL(4, vgAvatar);
                View ivAvatar = (View) this.LJLLILLLL.getValue();
                o.LJIIIIZZ(ivAvatar, "ivAvatar");
                V1B.LJLZ(ivAvatar);
                C71799SFv ivAvatar2 = (C71799SFv) this.LJLLILLLL.getValue();
                o.LJIIIIZZ(ivAvatar2, "ivAvatar");
                List<ImageUrlModel> list = c56685MMn2.LJLILLLLZI;
                if (list == null || (valueOf3 = ORZ.LJLLLLLL(0, list)) == null) {
                    valueOf3 = Integer.valueOf(R.drawable.b7n);
                }
                C71799SFv.LJIIJ(ivAvatar2, valueOf3, null, false, null, 126);
                aqS93S0101000_3 = new AqS169S0100000_3(this, 849);
            } else {
                View ivAvatar3 = (View) this.LJLLILLLL.getValue();
                o.LJIIIIZZ(ivAvatar3, "ivAvatar");
                KL2.LJIILLIIL(4, ivAvatar3);
                L9N vgAvatar2 = f0();
                o.LJIIIIZZ(vgAvatar2, "vgAvatar");
                V1B.LJLZ(vgAvatar2);
                L9N vgAvatar3 = f0();
                o.LJIIIIZZ(vgAvatar3, "vgAvatar");
                List<ImageUrlModel> list2 = c56685MMn2.LJLILLLLZI;
                if (list2 == null || (valueOf = ORZ.LJLLLLLL(0, list2)) == null) {
                    valueOf = Integer.valueOf(R.drawable.b7n);
                }
                L9N.LIZ(vgAvatar3, valueOf);
                L9N vgAvatar4 = f0();
                o.LJIIIIZZ(vgAvatar4, "vgAvatar");
                List<ImageUrlModel> list3 = c56685MMn2.LJLILLLLZI;
                if (list3 == null || (valueOf2 = ORZ.LJLLLLLL(1, list3)) == null) {
                    valueOf2 = Integer.valueOf(R.drawable.b7n);
                }
                L9N.LIZIZ(vgAvatar4, valueOf2);
                aqS93S0101000_3 = new AqS93S0101000_3(this, c56685MMn2.LJLIL - 1, 16);
            }
            final TuxTextView tvMsg = c0();
            o.LJIIIIZZ(tvMsg, "tvMsg");
            final String str = c56685MMn2.LJLJI;
            if (str == null) {
                str = "...";
            }
            tvMsg.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: X.8FN
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    float measuredWidth;
                    boolean z;
                    TuxTextView.this.getViewTreeObserver().removeOnPreDrawListener(TuxTextView.this);
                    String str2 = "";
                    String invoke = aqS93S0101000_3.invoke("");
                    float measureText = TuxTextView.this.getPaint().measureText("...");
                    float measureText2 = TuxTextView.this.getPaint().measureText(invoke);
                    float paddingEnd = TuxTextView.this.getPaddingEnd() + TuxTextView.this.getPaddingStart() + measureText2;
                    float f = 0.0f;
                    if (paddingEnd > TuxTextView.this.getMeasuredWidth()) {
                        List LJLJJI = s.LJLJJI(invoke, new char[]{' '}, false, 6);
                        TuxTextView tuxTextView = TuxTextView.this;
                        ArrayList arrayList = new ArrayList(C32I.LJJL(LJLJJI, 10));
                        Iterator it = LJLJJI.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Float.valueOf(tuxTextView.getPaint().measureText((String) it.next())));
                        }
                        if (arrayList.size() == 1) {
                            MNV mnv = this;
                            TextPaint paint = TuxTextView.this.getPaint();
                            o.LJIIIIZZ(paint, "paint");
                            int measuredWidth2 = TuxTextView.this.getMeasuredWidth();
                            mnv.getClass();
                            float measureText3 = paint.measureText(invoke);
                            float f2 = measuredWidth2;
                            int length = (int) ((measureText3 - f2) / (measureText3 / invoke.length()));
                            String substring = invoke.substring(length);
                            o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
                            if (paint.measureText(substring) > f2) {
                                while (true) {
                                    String substring2 = invoke.substring(length);
                                    o.LJIIIIZZ(substring2, "this as java.lang.String).substring(startIndex)");
                                    if (paint.measureText(substring2) <= f2) {
                                        break;
                                    }
                                    length++;
                                }
                            }
                            String substring3 = invoke.substring(0, length);
                            o.LJIIIIZZ(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                            f = paint.measureText(substring3);
                        } else {
                            int size = arrayList.size() - 1;
                            for (int i2 = 0; i2 < size && paddingEnd - f > TuxTextView.this.getMeasuredWidth(); i2++) {
                                f += ((Number) ListProtector.get(arrayList, i2)).floatValue();
                            }
                        }
                    }
                    if (paddingEnd > TuxTextView.this.getMeasuredWidth()) {
                        measuredWidth = (TuxTextView.this.getMeasuredWidth() - r5) - f;
                    } else {
                        measuredWidth = ((TuxTextView.this.getMeasuredWidth() - r5) * 2) - measureText2;
                    }
                    if (TuxTextView.this.getPaint().measureText(str) + measureText2 > TuxTextView.this.getMeasuredWidth()) {
                        View tvTitle = (View) this.LJLL.getValue();
                        o.LJIIIIZZ(tvTitle, "tvTitle");
                        z = true;
                        C26338AVi.LJI(tvTitle, null, 0, null, null, false, 29);
                        TuxTextView tvMsg2 = this.c0();
                        o.LJIIIIZZ(tvMsg2, "tvMsg");
                        C26338AVi.LJI(tvMsg2, null, null, null, 0, false, 23);
                    } else {
                        z = true;
                        View tvTitle2 = (View) this.LJLL.getValue();
                        o.LJIIIIZZ(tvTitle2, "tvTitle");
                        C26338AVi.LJI(tvTitle2, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))), null, null, false, 29);
                        TuxTextView tvMsg3 = this.c0();
                        o.LJIIIIZZ(tvMsg3, "tvMsg");
                        C26338AVi.LJI(tvMsg3, null, null, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))), false, 23);
                    }
                    if (C90193gN.LIZ()) {
                        str2 = "\u200f";
                    }
                    TuxTextView.this.setText(aqS93S0101000_3.invoke(str2.concat(ujb.o.LJJJJLL(TextUtils.ellipsize(str, TuxTextView.this.getPaint(), measuredWidth - measureText, TextUtils.TruncateAt.END).toString(), ' ', (char) 160, false))));
                    return z;
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (X.C2NU.LIZ.LIZIZ() == false) goto L5;
     */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r6) {
        /*
            r5 = this;
            X.EF7.LIZIZ()
            X.Ivu r0 = X.C2NU.LIZ     // Catch: java.lang.Exception -> Lb
            boolean r0 = r0.LIZIZ()     // Catch: java.lang.Exception -> Lb
            if (r0 != 0) goto L26
        Lb:
            X.MGN r0 = X.MGN.LJLILLLLZI
            boolean r0 = r0.isStandardUIEnable()
            if (r0 != 0) goto L26
            X.AKb r1 = new X.AKb
            androidx.fragment.app.Fragment r0 = r5.getFragment()
            r1.<init>(r0)
            r0 = 2131833361(0x7f113211, float:1.9299802E38)
            r1.LJIIIIZZ(r0)
            r1.LJIIJ()
            return
        L26:
            com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel r2 = r5.P()
            r1 = 0
            r0 = 1
            r2.zv0(r0, r1)
            androidx.fragment.app.Fragment r4 = r5.getFragment()
            X.MMe r0 = r5.N()
            X.MMn r0 = (X.C56685MMn) r0
            int r0 = r0.LJLIL
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            android.content.Intent r2 = new android.content.Intent
            android.content.Context r1 = r4.getContext()
            java.lang.Class<com.ss.android.ugc.aweme.notification.MusFollowRequestDetailActivity> r0 = com.ss.android.ugc.aweme.notification.MusFollowRequestDetailActivity.class
            r2.<init>(r1, r0)
            java.lang.String r0 = "unread_count"
            r2.putExtra(r0, r3)
            r0 = 1024(0x400, float:1.435E-42)
            X.C16880lQ.LJII(r4, r2, r0)
            X.7au r2 = new X.7au
            r2.<init>()
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = "notification_page"
            r2.LJIIIZ(r1, r0)
            X.MMe r0 = r5.N()
            X.MMn r0 = (X.C56685MMn) r0
            int r1 = r0.LJLIL
            java.lang.String r0 = "message_number"
            r2.LIZLLL(r1, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "enter_follow_request"
            X.FMX.LJIIL(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MNV.onClick(android.view.View):void");
    }
}
