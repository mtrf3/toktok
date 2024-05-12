package com.ss.android.ugc.aweme.mention.ui.cell;

import X.AJ9;
import X.AP9;
import X.C16880lQ;
import X.C19N;
import X.C1DI;
import X.C214298b3;
import X.C218028h4;
import X.C218238hP;
import X.C218248hQ;
import X.C218258hR;
import X.C218268hS;
import X.C218278hT;
import X.C218288hU;
import X.C218298hV;
import X.C221108m2;
import X.C56331M8x;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73030SlO;
import X.C78897Uxp;
import X.C7DS;
import X.C85990Xow;
import X.C89953fz;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.EnumC217828gk;
import X.InterfaceC65784Pro;
import X.InterfaceC93923mO;
import X.Y9G;
import X.Y9H;
import X.YE1;
import Y.ACListenerS25S1200000_3;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.mention.viewmodel.VideoCaptionMentionSearchViewModel;
import com.ss.android.ugc.aweme.search.service.ISearchUserService;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS46S1200000_3;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes4.dex */
public final class VideoCaptionMentionSearchCell extends PowerCell<C218028h4> {
    public final C214298b3 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    public final VideoCaptionMentionSearchViewModel L() {
        return (VideoCaptionMentionSearchViewModel) this.LJLIL.getValue();
    }

    public VideoCaptionMentionSearchCell() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(VideoCaptionMentionSearchViewModel.class);
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(LIZ, 482);
        C218268hS c218268hS = C218268hS.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS153S0100000_3, C218248hQ.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 483), new AqS153S0100000_3((InterfaceC93923mO) this, 484), C218298hV.INSTANCE, c218268hS, new AqS153S0100000_3((InterfaceC93923mO) this, 485), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS153S0100000_3, C218258hR.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 486), new AqS153S0100000_3((InterfaceC93923mO) this, 477), C218288hU.INSTANCE, c218268hS, new AqS153S0100000_3((InterfaceC93923mO) this, 478), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS153S0100000_3, C218238hP.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 479), new AqS153S0100000_3((InterfaceC93923mO) this, 480), new AqS153S0100000_3((InterfaceC93923mO) this, 481), c218268hS, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLIL = c214298b3;
        this.LJLILLLLZI = C221108m2.LIZIZ(C218278hT.LJLIL);
        this.LJLJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 476));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C218028h4 c218028h4) {
        float f;
        boolean z;
        Integer valueOf;
        String str;
        int i;
        String str2;
        C218028h4 t = c218028h4;
        o.LJIIIZ(t, "t");
        View findViewById = this.itemView.findViewById(R.id.gh1);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.…ntion_item_section_label)");
        TextView textView = (TextView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.ggy);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.…mention_item_index_label)");
        View findViewById3 = this.itemView.findViewById(R.id.ggw);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.mention_item_avatar)");
        AP9 ap9 = (AP9) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.ggz);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.mention_item_name)");
        TextView textView2 = (TextView) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.ggx);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.mention_item_desc)");
        TextView textView3 = (TextView) findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.gh0);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.mention_item_relation)");
        ImageView imageView = (ImageView) findViewById6;
        L().getClass();
        View[] viewArr = {textView2, textView3, imageView, ap9};
        boolean z2 = t.LJLIL.LJIJI.LIZ;
        int i2 = 0;
        do {
            View view = viewArr[i2];
            if (z2) {
                f = 1.0f;
            } else {
                f = 0.3f;
            }
            view.setAlpha(f);
            i2++;
        } while (i2 < 4);
        ISearchUserService iSearchUserService = (ISearchUserService) this.LJLILLLLZI.getValue();
        if (iSearchUserService != null && iSearchUserService.LJ()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (getBindingAdapterPosition() < 0) {
                if (getBindingAdapterPosition() == 0) {
                    valueOf = Integer.valueOf(R.string.buo);
                }
                valueOf = null;
            } else {
                if (getBindingAdapterPosition() == 0) {
                    valueOf = Integer.valueOf(R.string.buk);
                }
                valueOf = null;
            }
        } else {
            if (getBindingAdapterPosition() == 0) {
                valueOf = Integer.valueOf(R.string.buk);
            }
            valueOf = null;
        }
        if (valueOf != null) {
            textView.setVisibility(0);
            textView.setText(valueOf.intValue());
        } else {
            textView.setVisibility(8);
        }
        SpannableString spannableString = new SpannableString(C56331M8x.LIZIZ(Y9H.LIZJ(t.LJLIL), false, false));
        for (Position position : t.LJLIL.LJIJI.LJIIIIZZ) {
            int begin = position.getBegin();
            int end = position.getEnd() + 1;
            Integer LIZIZ = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.e2);
            if (!TextUtils.isEmpty(spannableString) && LIZIZ != null) {
                if (begin <= 0) {
                    begin = 0;
                }
                if (!TextUtils.isEmpty(spannableString) && begin <= end && begin < spannableString.length() && end <= spannableString.length()) {
                    spannableString.setSpan(new ForegroundColorSpan(LIZIZ.intValue()), begin, end, 17);
                }
            }
        }
        textView2.setText(spannableString);
        textView3.setVisibility(0);
        if (!C85990Xow.LJIIIZ()) {
            str = "@";
        } else {
            str = (String) this.LJLJI.getValue();
        }
        String LIZ = C56331M8x.LIZ(Y9H.LIZJ(t.LJLIL), false, false);
        int highlightColor = textView3.getHighlightColor();
        String text = i0.LJFF(str, LIZ);
        StringBuilder sb = new StringBuilder();
        String charSequence = s.LJZI(LIZ).toString();
        for (int i3 = 0; i3 < charSequence.length(); i3++) {
            sb.append(C73030SlO.LJIIL(charSequence.charAt(i3)));
        }
        String sb2 = sb.toString();
        String str3 = "";
        if (sb2 == null) {
            sb2 = "";
        }
        StringBuilder sb3 = new StringBuilder();
        String charSequence2 = s.LJZI(LIZ).toString();
        for (int i4 = 0; i4 < charSequence2.length(); i4++) {
            sb3.append(C73030SlO.LJIIL(charSequence2.charAt(i4)).charAt(0));
        }
        String sb4 = sb3.toString();
        if (sb4 != null) {
            str3 = sb4;
        }
        String LJIIL = C78897Uxp.LJIIL(LIZ, sb2, str3, L().LJLIL);
        o.LJIIIIZZ(LJIIL, "convertPinyinToHanzi(\n  …Keyword\n                )");
        int length = str.length();
        o.LJIIIZ(text, "text");
        if (s.LJJJZ(LJIIL, '.')) {
            LJIIL = ujb.o.LJJJJZ(LJIIL, ".", "\\.", false);
        }
        SpannableString spannableString2 = new SpannableString(text);
        try {
            Pattern compile = PatternProtector.compile(LJIIL);
            if (compile != null) {
                Matcher matcher = compile.matcher(spannableString2);
                if (matcher.find()) {
                    int start = matcher.start();
                    int end2 = matcher.end();
                    if (start >= length) {
                        spannableString2.setSpan(new ForegroundColorSpan(highlightColor), start, end2, 33);
                    }
                }
            }
        } catch (PatternSyntaxException e) {
            C16880lQ.LLLLIIL(e);
        }
        textView3.setText(spannableString2);
        View view2 = this.itemView;
        view2.setBackground(C89953fz.LIZ(view2.getContext()));
        view2.setAlpha(1.0f);
        findViewById2.setVisibility(8);
        Y9G y9g = t.LJLIL;
        ap9.setUserData(new UserVerify(y9g.LJFF, y9g.LJIIIIZZ, y9g.LJIIIZ, Integer.valueOf(y9g.LJIIJ)));
        Context context = this.itemView.getContext();
        Y9G y9g2 = t.LJLIL;
        String str4 = y9g2.LJIIIIZZ;
        String str5 = y9g2.LJIIIZ;
        ap9.LIZ();
        AJ9.LJ(context, str4, str5, textView2);
        if (((ISearchUserService) this.LJLILLLLZI.getValue()).LJ() && t.LJLIL.LIZIZ == 2) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
        if (t.LJLIL.LJIJI.LIZIZ == EnumC217828gk.FOLLOW) {
            str2 = "follow";
        } else {
            str2 = "all_user";
        }
        C16880lQ.LJIIJ(new ACListenerS25S1200000_3(t, this, str2, 8), this.itemView);
        C7DS.LIZIZ("trending_words_show", new AqS134S0200000_3(this, t.LJLIL, 248));
        C7DS.LIZIZ("tag_mention_head_show", new AqS46S1200000_3(t.LJLIL, str2, this, 10));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.bsl, viewGroup, false, "from(parent.context)\n   …list_item, parent, false)");
    }
}
