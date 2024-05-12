package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.576, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass576 extends AbstractC029409q<AnonymousClass579> {
    public final AnonymousClass551 LJLIL;
    public final Boolean LJLILLLLZI;
    public C1296356x LJLJI;
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(C1296056u.LJLIL);
    public final ArrayList<AnonymousClass572> LJLJJL = new ArrayList<>();
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 864));

    public final List<ResourceItem> LJLLLLLL() {
        ArrayList<AnonymousClass572> arrayList = this.LJLJJL;
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator<AnonymousClass572> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().LJLIL);
        }
        return arrayList2;
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLJJL.size();
    }

    public AnonymousClass576(AnonymousClass551 anonymousClass551, Boolean bool) {
        this.LJLIL = anonymousClass551;
        this.LJLILLLLZI = bool;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f6, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0061, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L8;
     */
    @Override // X.AbstractC029409q
    /* renamed from: LJLZ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.AnonymousClass579 r18, int r19) {
        /*
            Method dump skipped, instructions count: 750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass576.onBindViewHolder(X.579, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJZL(X.AnonymousClass572 r5, X.AnonymousClass579 r6) {
        /*
            r4 = this;
            X.Ol8 r0 = r4.LJLJJI
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r3 = 0
            if (r0 == 0) goto L31
            X.59Z r0 = r6.LJLJLLL
            if (r0 != 0) goto L2d
        L13:
            X.59Z r1 = r6.LJLJLLL
            if (r1 == 0) goto L1c
            int r0 = r5.LJLJJI
            r1.setProgress(r0)
        L1c:
            android.widget.ImageView r0 = r6.LJLJJL
            r1 = 4
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r6.LJLJI
            r0.setVisibility(r1)
            android.widget.TextView r0 = r6.LJLJJLL
            r0.setVisibility(r1)
            return
        L2d:
            r0.setVisibility(r3)
            goto L13
        L31:
            X.551 r0 = r4.LJLIL
            X.53k r0 = r0.LJIIZILJ
            X.Pro<android.view.View> r0 = r0.LIZ
            if (r0 == 0) goto L56
            android.view.View r1 = r6.itemView
            r0 = 2131374684(0x7f0a325c, float:1.8369494E38)
            android.view.View r2 = r1.findViewById(r0)
            r2.setVisibility(r3)
            X.551 r0 = r4.LJLIL
            X.53k r0 = r0.LJIIZILJ
            X.57Q r1 = r0.LIZIZ
            if (r1 == 0) goto L56
            int r0 = r5.LJLJJI
            r1.LIZIZ(r0, r2)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L1c
        L56:
            android.widget.FrameLayout r0 = r6.LJLJJI
            r0.setVisibility(r3)
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass576.LJZL(X.572, X.579):void");
    }

    public final void LLD(AnonymousClass572 anonymousClass572, AnonymousClass579 anonymousClass579) {
        View view;
        C1296156v c1296156v = this.LJLIL.LJIIIIZZ;
        float f = 1.0f;
        if (c1296156v.LJLIL) {
            float f2 = c1296156v.LJLJLLL;
            C5CJ c5cj = anonymousClass579.LJLIL;
            if (anonymousClass572.LJLJJL) {
                f2 = 1.0f;
            }
            c5cj.setAlpha(f2);
        }
        C57B c57b = this.LJLIL.LJII;
        if (c57b.LIZ) {
            float f3 = c57b.LJII;
            if (c57b.LJIIIIZZ == null || (view = anonymousClass579.itemView.findViewById(R.id.iym)) == null) {
                view = anonymousClass579.LJLILLLLZI;
            }
            if (!anonymousClass572.LJLJJL) {
                f = f3;
            }
            view.setAlpha(f);
        }
    }

    public final void LLFII(AnonymousClass579 anonymousClass579, int i) {
        if (this.LJLIL.LJII.LJIIIIZZ != null) {
            ((TextView) anonymousClass579.itemView.findViewById(R.id.iym)).setTextColor(i);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        anonymousClass579.LJLILLLLZI.setTextColor(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0363, code lost:
    
        if (com.bytedance.ies.abmock.SettingsManager.LIZ("catch_onCreateViewHolder_crash", true) != false) goto L59;
     */
    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AnonymousClass579 com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(android.view.ViewGroup r22, int r23) {
        /*
            Method dump skipped, instructions count: 948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass576.com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(android.view.ViewGroup, int):androidx.recyclerview.widget.RecyclerView$ViewHolder");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJZ(X.AnonymousClass579 r4, X.AnonymousClass572 r5, int r6) {
        /*
            r3 = this;
            X.Ol8 r0 = r3.LJLJJI
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 4
            if (r0 == 0) goto L21
            X.59Z r0 = r4.LJLJLLL
            if (r0 != 0) goto L1d
        L13:
            android.widget.ImageView r1 = r4.LJLJJL
            r0 = 0
            r1.setVisibility(r0)
        L19:
            r3.LLFF(r5, r4, r6)
            return
        L1d:
            r0.setVisibility(r2)
            goto L13
        L21:
            X.551 r0 = r3.LJLIL
            X.53k r0 = r0.LJIIZILJ
            X.Pro<android.view.View> r0 = r0.LIZ
            if (r0 == 0) goto L44
            android.view.View r1 = r4.itemView
            r0 = 2131374684(0x7f0a325c, float:1.8369494E38)
            android.view.View r1 = r1.findViewById(r0)
            r1.setVisibility(r2)
            X.551 r0 = r3.LJLIL
            X.53k r0 = r0.LJIIZILJ
            X.57Q r0 = r0.LIZIZ
            if (r0 == 0) goto L44
            r0.LIZLLL(r1)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L19
        L44:
            android.widget.FrameLayout r0 = r4.LJLJJI
            r0.setVisibility(r2)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass576.LJZ(X.579, X.572, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJZI(X.AnonymousClass579 r4, X.AnonymousClass572 r5, int r6) {
        /*
            r3 = this;
            X.Ol8 r0 = r3.LJLJJI
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 4
            if (r0 == 0) goto L29
            X.59Z r1 = r4.LJLJLLL
            if (r1 == 0) goto L18
            r0 = 100
            r1.setProgress(r0)
        L18:
            X.59Z r0 = r4.LJLJLLL
            if (r0 != 0) goto L25
        L1c:
            android.widget.ImageView r0 = r4.LJLJJL
            r0.setVisibility(r2)
            r3.LLFFF(r5, r4, r6)
            return
        L25:
            r0.setVisibility(r2)
            goto L1c
        L29:
            X.551 r0 = r3.LJLIL
            X.53k r0 = r0.LJIIZILJ
            X.Pro<android.view.View> r0 = r0.LIZ
            if (r0 == 0) goto L4c
            android.view.View r1 = r4.itemView
            r0 = 2131374684(0x7f0a325c, float:1.8369494E38)
            android.view.View r1 = r1.findViewById(r0)
            r1.setVisibility(r2)
            X.551 r0 = r3.LJLIL
            X.53k r0 = r0.LJIIZILJ
            X.57Q r0 = r0.LIZIZ
            if (r0 == 0) goto L4c
            r0.LIZ(r1)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L1c
        L4c:
            android.widget.FrameLayout r0 = r4.LJLJJI
            r0.setVisibility(r2)
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass576.LJZI(X.579, X.572, int):void");
    }

    public final void LLF(Context context, AnonymousClass572 anonymousClass572, AnonymousClass579 anonymousClass579) {
        int i;
        C1295956t c1295956t = this.LJLIL.LJIIJJI;
        if (c1295956t.LJLIL && (i = c1295956t.LJLJLJ) != R.color.yi) {
            if (anonymousClass572.LJLJI) {
                anonymousClass579.LJLIL.setColorFilter(C04330Ez.LIZIZ(context, i));
            } else {
                anonymousClass579.LJLIL.setColorFilter(C04330Ez.LIZIZ(context, R.color.yi));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00fc, code lost:
    
        if (r4.LJIIL.LIZLLL == false) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLFF(X.AnonymousClass572 r9, X.AnonymousClass579 r10, int r11) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass576.LLFF(X.572, X.579, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LLFFF(AnonymousClass572 anonymousClass572, AnonymousClass579 anonymousClass579, int i) {
        if (anonymousClass572.LJLJI) {
            anonymousClass579.LJLJI.setBackgroundResource(this.LJLIL.LJIIJJI.LJLJJI);
            AnonymousClass551 anonymousClass551 = this.LJLIL;
            AnonymousClass553 anonymousClass553 = anonymousClass551.LJI;
            if (anonymousClass553.LIZ && i == 0 && !anonymousClass553.LJFF) {
                anonymousClass579.LJLJI.setImageResource(anonymousClass553.LJI);
            } else {
                anonymousClass579.LJLJI.setImageResource(anonymousClass551.LJIIJJI.LJLJJI);
            }
            if (this.LJLIL.LJIIJJI.LJLIL) {
                anonymousClass579.LJLJI.setVisibility(0);
                C57B c57b = this.LJLIL.LJII;
                if (c57b.LIZ) {
                    LLFII(anonymousClass579, c57b.LIZJ);
                    C57B c57b2 = this.LJLIL.LJII;
                    InterfaceC88472Yns<TextView, C76800UCe> interfaceC88472Yns = c57b2.LJIIIZ;
                    if (interfaceC88472Yns != 0 && c57b2.LJIIIIZZ != null) {
                        View customTextView = anonymousClass579.itemView.findViewById(R.id.iym);
                        o.LJIIIIZZ(customTextView, "customTextView");
                        interfaceC88472Yns.invoke(customTextView);
                    }
                }
            }
            if (!TextUtils.isEmpty(this.LJLIL.LJIIJJI.LJLJL)) {
                anonymousClass579.LJLJJLL.setVisibility(0);
                anonymousClass579.LJLJJLL.setText(this.LJLIL.LJIIJJI.LJLJL);
                return;
            }
            return;
        }
        anonymousClass579.LJLJI.setVisibility(4);
        anonymousClass579.LJLJJLL.setVisibility(4);
        C57B c57b3 = this.LJLIL.LJII;
        if (!c57b3.LIZ) {
            return;
        }
        LLFII(anonymousClass579, c57b3.LIZIZ);
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(AnonymousClass579 anonymousClass579, int i, List payloads) {
        String str;
        AnonymousClass579 viewHolder = anonymousClass579;
        o.LJIIIZ(viewHolder, "viewHolder");
        o.LJIIIZ(payloads, "payloads");
        if (payloads.isEmpty()) {
            onBindViewHolder(viewHolder, i);
            return;
        }
        for (Object obj : payloads) {
            if ((obj instanceof String) && (str = (String) obj) != null) {
                int hashCode = str.hashCode();
                boolean z = true;
                if (hashCode != -1552942556) {
                    if (hashCode != -572052449) {
                        if (hashCode == 36352664 && str.equals("select_refresh")) {
                            Object obj2 = ListProtector.get(this.LJLJJL, i);
                            o.LJIIIIZZ(obj2, "resourceModelList[position]");
                            AnonymousClass572 anonymousClass572 = (AnonymousClass572) obj2;
                            AnonymousClass551 anonymousClass551 = this.LJLIL;
                            boolean z2 = anonymousClass551.LJI.LIZ;
                            boolean z3 = anonymousClass551.LJIIL.LIZIZ;
                            int i2 = C1296556z.LIZIZ[anonymousClass572.LJLILLLLZI.ordinal()];
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    if (i2 == 3) {
                                        LLFFF(anonymousClass572, viewHolder, i);
                                    }
                                } else {
                                    viewHolder.LJLJI.setVisibility(4);
                                    viewHolder.LJLJJLL.setVisibility(4);
                                }
                            } else {
                                LLFF(anonymousClass572, viewHolder, i);
                            }
                            if (!z2 || i != 0) {
                                if (z2 ? i != 1 || !z3 : i != 0 || !z3) {
                                    z = false;
                                }
                                if (0 == 0 && !z) {
                                    AnonymousClass551 anonymousClass5512 = this.LJLIL;
                                    boolean z4 = anonymousClass5512.LJIIIIZZ.LJLJLJ;
                                    if (anonymousClass5512.LJIILIIL == EnumC123914tf.IMAGE && z4 && anonymousClass572.LJLJI && o.LJ(this.LJLILLLLZI, Boolean.FALSE)) {
                                        C5CG c5cg = C5CG.LIZ;
                                        Context context = viewHolder.itemView.getContext();
                                        o.LJIIIIZZ(context, "viewHolder.itemView.context");
                                        String str2 = anonymousClass572.LJLIL.selectedIcon;
                                        o.LJIIIIZZ(str2, "resourceModel.resourceItem.selectedIcon");
                                        C5CJ c5cj = viewHolder.LJLIL;
                                        C5CV c5cv = new C5CV();
                                        c5cv.LIZ(ImageView.ScaleType.CENTER_CROP);
                                        C1296156v c1296156v = this.LJLIL.LJIIIIZZ;
                                        c5cv.LJ = c1296156v.LJLJJI;
                                        c5cv.LIZLLL = Integer.valueOf(c1296156v.LJLJJLL);
                                        c5cg.LIZ(context, str2, c5cj, new C5CW(c5cv));
                                    }
                                    LLF(C132105Gk.LIZ(), anonymousClass572, viewHolder);
                                }
                            }
                        }
                    } else if (str.equals("enable_refresh")) {
                        Object obj3 = ListProtector.get(this.LJLJJL, i);
                        o.LJIIIIZZ(obj3, "resourceModelList[position]");
                        LLD((AnonymousClass572) obj3, viewHolder);
                    }
                } else if (str.equals("download_refresh")) {
                    Object obj4 = ListProtector.get(this.LJLJJL, i);
                    o.LJIIIIZZ(obj4, "resourceModelList[position]");
                    AnonymousClass572 anonymousClass5722 = (AnonymousClass572) obj4;
                    View view = viewHolder.itemView;
                    o.LJIIIIZZ(view, "viewHolder.itemView");
                    Context context2 = view.getContext();
                    int i3 = C1296556z.LIZIZ[anonymousClass5722.LJLILLLLZI.ordinal()];
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 == 3) {
                                o.LJIIIIZZ(context2, "context");
                                LJZI(viewHolder, anonymousClass5722, i);
                            }
                        } else {
                            LJZL(anonymousClass5722, viewHolder);
                        }
                    } else {
                        o.LJIIIIZZ(context2, "context");
                        LJZ(viewHolder, anonymousClass5722, i);
                    }
                }
            }
        }
    }

    public static void LL(AnonymousClass064 anonymousClass064, int i, int i2, int i3) {
        anonymousClass064.LJIIL(i, C134855Qz.LIZ(i2));
        anonymousClass064.LJIIJ(i, C134855Qz.LIZ(i3));
    }
}
