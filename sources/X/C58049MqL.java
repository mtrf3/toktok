package X;

import Y.AfS18S1200000_9;
import Y.AfS58S0200000_9;
import Y.IDaS219S0100000_9;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.relation.label.IRelationLabelTextViewService;
import com.ss.android.ugc.aweme.relation.label.RelationLabelTextViewServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import ujb.o;

/* renamed from: X.MqL, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58049MqL extends TuxTextView {
    public static final String LLII = o.LJJJJLI(100, new StringBuilder(" "));
    public InterfaceC88472Yns<? super Integer, C76800UCe> LJLLLL;
    public C73411SrX LJLLLLLL;
    public SpannableStringBuilder LJLZ;
    public float LJZ;
    public long LJZI;
    public long LJZL;
    public long LL;
    public long LLD;
    public boolean LLF;
    public boolean LLFF;
    public String LLFFF;
    public C58055MqR LLFII;
    public C57749MlV LLFZ;
    public String LLI;
    public final java.util.Map<Integer, View> LLIFFJFJJ;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C58049MqL(Context context) {
        this(context, null, 6);
        kotlin.jvm.internal.o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C58049MqL(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        kotlin.jvm.internal.o.LJIIIZ(context, "context");
    }

    @Override // com.bytedance.tux.input.TuxTextView
    public final View LJJIJIL(int i) {
        java.util.Map<Integer, View> map = this.LLIFFJFJJ;
        Integer valueOf = Integer.valueOf(R.id.title);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.title);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    public final void LJJJJL() {
        boolean z;
        Integer num;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        EnumC58061MqX enumC58061MqX;
        Boolean bool5;
        EnumC57741MlN enumC57741MlN;
        long nanoTime = System.nanoTime();
        C188727au c188727au = new C188727au();
        c188727au.LJ(this.LJZL - this.LJZI, "translation_time");
        c188727au.LJ(this.LL - this.LJZL, "detect_size_time");
        c188727au.LJ(nanoTime - this.LL, "real_bind_time");
        c188727au.LJ(this.LLD - this.LJZI, "invisible_time");
        c188727au.LJ(this.LLD - this.LL, "text_build_time");
        c188727au.LJ(nanoTime - this.LJZI, "total_bind_time");
        c188727au.LJFF(Boolean.valueOf(this.LLF), "hit_cache");
        c188727au.LJFF(Boolean.valueOf(this.LLFF), "detect_size");
        C57749MlV c57749MlV = this.LLFZ;
        Boolean bool6 = null;
        if (c57749MlV != null && c57749MlV.LIZIZ != null) {
            z = true;
        } else {
            z = false;
        }
        c188727au.LJFF(Boolean.valueOf(z), "has_tail");
        c188727au.LJIIIZ("rec_type", this.LLFFF);
        c188727au.LIZLLL(C58062MqY.LIZIZ.LJFF(), "cache_overload");
        C58055MqR c58055MqR = this.LLFII;
        if (c58055MqR != null && (enumC57741MlN = c58055MqR.LIZ) != null) {
            num = Integer.valueOf(enumC57741MlN.ordinal());
        } else {
            num = null;
        }
        c188727au.LJFF(num, "config_ext_style");
        C58055MqR c58055MqR2 = this.LLFII;
        if (c58055MqR2 != null) {
            bool = Boolean.valueOf(c58055MqR2.LIZIZ);
        } else {
            bool = null;
        }
        c188727au.LJFF(bool, "config_tail_avatar");
        C58055MqR c58055MqR3 = this.LLFII;
        if (c58055MqR3 != null) {
            bool2 = Boolean.valueOf(c58055MqR3.LIZJ);
        } else {
            bool2 = null;
        }
        c188727au.LJFF(bool2, "config_avatar_next_line");
        C58055MqR c58055MqR4 = this.LLFII;
        if (c58055MqR4 != null) {
            bool3 = Boolean.valueOf(c58055MqR4.LIZLLL);
        } else {
            bool3 = null;
        }
        c188727au.LJFF(bool3, "config_name_bold");
        C58055MqR c58055MqR5 = this.LLFII;
        if (c58055MqR5 != null) {
            bool4 = Boolean.valueOf(c58055MqR5.LJ);
        } else {
            bool4 = null;
        }
        c188727au.LJFF(bool4, "config_name_clickable");
        C58055MqR c58055MqR6 = this.LLFII;
        if (c58055MqR6 != null) {
            enumC58061MqX = c58055MqR6.LJFF;
        } else {
            enumC58061MqX = null;
        }
        c188727au.LJFF(enumC58061MqX, "config_ellipsis_strategy");
        C58055MqR c58055MqR7 = this.LLFII;
        if (c58055MqR7 != null) {
            bool5 = Boolean.valueOf(c58055MqR7.LJII);
        } else {
            bool5 = null;
        }
        c188727au.LJFF(bool5, "config_cacheable");
        C58055MqR c58055MqR8 = this.LLFII;
        if (c58055MqR8 != null) {
            bool6 = Boolean.valueOf(c58055MqR8.LJI);
        }
        c188727au.LJFF(bool6, "config_fix_width");
        c188727au.LJIIIZ("bind_result", this.LLI);
        FMX.LJIIL("relation_label_bind", c188727au.LIZ);
    }

    public final void setClickHandler(InterfaceC88472Yns<? super Integer, C76800UCe> handler) {
        kotlin.jvm.internal.o.LJIIIZ(handler, "handler");
        this.LJLLLL = handler;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x011b, code lost:
    
        if (r1.equals("3-14") == false) goto L72;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x006b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJ(com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct r7, X.C58055MqR r8) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58049MqL.LJJJJ(com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct, X.MqR):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C58049MqL(android.content.Context r3, android.util.AttributeSet r4, int r5) {
        /*
            r2 = this;
            r0 = r5 & 2
            if (r0 == 0) goto L5
            r4 = 0
        L5:
            java.lang.String r0 = "context"
            java.util.LinkedHashMap r0 = X.C62850Ola.LJFF(r3, r0)
            r2.LLIFFJFJJ = r0
            r0 = 0
            r2.<init>(r3, r4, r0)
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2.LJZI = r0
            r2.LJZL = r0
            r2.LL = r0
            java.lang.String r0 = ""
            r2.LLFFF = r0
            java.lang.String r0 = "success"
            r2.LLI = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58049MqL.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final void LJJJIL(C57749MlV relationLabelMeta, C58055MqR config, float f) {
        String str;
        kotlin.jvm.internal.o.LJIIIZ(relationLabelMeta, "relationLabelMeta");
        kotlin.jvm.internal.o.LJIIIZ(config, "config");
        this.LL = System.nanoTime();
        this.LLFII = config;
        this.LLFZ = relationLabelMeta;
        this.LLD = 0L;
        this.LLI = "success";
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('[');
        LIZ.append(hashCode());
        LIZ.append("]BIND width:[");
        LIZ.append(f);
        LIZ.append("] text:[");
        C57742MlO c57742MlO = relationLabelMeta.LIZ;
        if (c57742MlO != null) {
            str = c57742MlO.LJLIL;
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(']');
        C221018lt.LIZ("RelationLabel[V]", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(relationLabelMeta.hashCode());
        LIZ2.append('|');
        LIZ2.append(config.hashCode());
        LIZ2.append('|');
        LIZ2.append(getTextSize());
        LIZ2.append('|');
        LIZ2.append(getMaxLines());
        LIZ2.append('|');
        LIZ2.append(f);
        String signature = X1D.LIZIZ(LIZ2);
        this.LLF = false;
        if (config.LJII) {
            kotlin.jvm.internal.o.LJIIIZ(signature, "signature");
            SpannableStringBuilder LIZIZ = C58062MqY.LIZIZ.LIZIZ(signature);
            if (LIZIZ != null) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(hashCode());
                LIZ3.append(" set cache text ");
                LIZ3.append((Object) LIZIZ);
                C221018lt.LIZ("RelationLabel[V]", X1D.LIZIZ(LIZ3));
                setText(LIZIZ);
                this.LLF = true;
                this.LLD = System.nanoTime();
                LJJJJL();
                return;
            }
        }
        if (config.LJ) {
            setMovementMethod(AnonymousClass898.LIZ);
            setHighlightColor(0);
        }
        if (this.LLFF) {
            post(new RunnableC58059MqV(this, relationLabelMeta, config, f, signature));
        } else {
            LJJJJJ(relationLabelMeta, config, f, signature);
        }
    }

    public final void LJJJJJ(C57749MlV c57749MlV, C58055MqR c58055MqR, float f, String str) {
        IRelationLabelTextViewService iRelationLabelTextViewService;
        Object LIZ = C58096Mr6.LIZ(IRelationLabelTextViewService.class, false);
        if (LIZ != null) {
            iRelationLabelTextViewService = (IRelationLabelTextViewService) LIZ;
        } else {
            if (C58096Mr6.u4 == null) {
                synchronized (IRelationLabelTextViewService.class) {
                    if (C58096Mr6.u4 == null) {
                        C58096Mr6.u4 = new RelationLabelTextViewServiceImpl();
                    }
                }
            }
            iRelationLabelTextViewService = C58096Mr6.u4;
        }
        C58053MqP LIZ2 = iRelationLabelTextViewService.LIZ(c57749MlV, c58055MqR, this, f);
        LIZ2.LJIIIIZZ = this.LJLLLL;
        SpannableStringBuilder LIZJ = LIZ2.LIZJ();
        this.LJLZ = LIZJ;
        setText(LIZJ);
        this.LLD = System.nanoTime();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(hashCode());
        LIZ3.append(" set initial text ");
        LIZ3.append((Object) this.LJLZ);
        C221018lt.LIZ("RelationLabel[V]", X1D.LIZIZ(LIZ3));
        this.LJLLLLLL = (C73411SrX) LIZ2.LJII().LJJL(T16.LIZIZ).LJJJ(C73969T1h.LIZIZ()).LJJ(new IDaS219S0100000_9(this, 3)).LJJJLL(new AfS58S0200000_9(this, c58055MqR, 8), new AfS18S1200000_9(this, str, c57749MlV, 0), new C58052MqO(this, c58055MqR, str, c57749MlV));
    }
}
