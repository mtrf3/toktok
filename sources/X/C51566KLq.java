package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.pages.result.bot.markdown.style.MarkDownBulletSpan;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.jvm.internal.o;

/* renamed from: X.KLq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51566KLq implements C4H5 {
    public static final C51566KLq LIZ = new C51566KLq();

    @Override // X.C4H5
    public final List LIZIZ(String str) {
        Matcher matcher = PatternProtector.compile("(<u><b>)([\\s\\S]+?)(</b></u>)").matcher(str);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (matcher.find()) {
            if (i < matcher.start()) {
                String substring = str.substring(i, matcher.start());
                o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(new C4H6(substring, false));
            }
            String group = matcher.group();
            o.LJIIIIZZ(group, "matcher.group()");
            arrayList.add(new C4H6(group, true));
            i = matcher.end() + 1;
        }
        if (i < str.length()) {
            String substring2 = str.substring(i, str.length());
            o.LJIIIIZZ(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(new C4H6(substring2, false));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    @Override // X.C4H5
    public final String LIZ(String str, C61878OQg removePatternList) {
        o.LJIIIZ(removePatternList, "removePatternList");
        if (str == null) {
            return "";
        }
        boolean z = !removePatternList.isEmpty();
        C61878OQg c61878OQg = removePatternList;
        if (!z) {
            c61878OQg = C47261Igj.LJJIJIIJI("<sup[^>]*?>[\\s\\S]*?<\\/sup>", "<u><b>", "</b></u>");
        }
        Iterator it = c61878OQg.iterator();
        while (it.hasNext()) {
            str = PatternProtector.compile((String) it.next(), 2).matcher(str).replaceAll("");
            o.LJIIIIZZ(str, "compile(it, Pattern.CASE…er(result).replaceAll(\"\")");
        }
        return str;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.8FJ] */
    @Override // X.C4H5
    public final Spanned LIZJ(String str, final TuxTextView tuxTextView, final InterfaceC116744i6 interfaceC116744i6, final java.util.Map map) {
        try {
            return new C87733Ybx(str, new InterfaceC87736Yc0(tuxTextView, interfaceC116744i6, map) { // from class: X.8FJ
                public final InterfaceC116744i6 LIZ;
                public final java.util.Map<String, Object> LIZIZ;
                public final int LIZJ;
                public final int LIZLLL;
                public final int LJ;
                public final int LJFF;

                @Override // X.InterfaceC87736Yc0
                public final SpannableStringBuilder LIZ(CharSequence charSequence) {
                    o.LJIIIZ(charSequence, "charSequence");
                    SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
                    C8FI c8fi = new C8FI(this.LJFF, charSequence, this.LIZIZ, this.LIZ);
                    T5U t5u = new T5U(42, true);
                    valueOf.setSpan(c8fi, 0, charSequence.length(), 33);
                    valueOf.setSpan(t5u, 0, charSequence.length(), 33);
                    return valueOf;
                }

                @Override // X.InterfaceC87736Yc0
                public final SpannableStringBuilder LIZLLL(CharSequence charSequence) {
                    o.LJIIIZ(charSequence, "charSequence");
                    SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
                    C8FG c8fg = new C8FG(this.LIZLLL, this.LJ);
                    c8fg.LJLLI = this.LIZ;
                    valueOf.setSpan(c8fg, 0, charSequence.length(), 33);
                    return valueOf;
                }

                @Override // X.InterfaceC87736Yc0
                public final SpannableStringBuilder LIZJ(int i, CharSequence charSequence) {
                    SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
                    valueOf.setSpan(new MarkDownBulletSpan(i, this.LIZJ, 0), 0, valueOf.length(), 33);
                    return valueOf;
                }

                {
                    Context context;
                    int i;
                    int i2;
                    int i3;
                    int i4;
                    int i5;
                    this.LIZ = interfaceC116744i6;
                    this.LIZIZ = map;
                    new WeakReference(tuxTextView);
                    if (tuxTextView != null && (context = tuxTextView.getContext()) != null) {
                        Integer LJI = C79045V0n.LJI(R.attr.go, context);
                        if (LJI != null) {
                            i = LJI.intValue();
                        } else {
                            i = 0;
                        }
                        this.LIZJ = i;
                        if (((Boolean) C49624Jdk.LJIIIZ.getValue()).booleanValue()) {
                            Integer LJI2 = C79045V0n.LJI(R.attr.gx, context);
                            if (LJI2 != null) {
                                i4 = LJI2.intValue();
                            } else {
                                i4 = 0;
                            }
                            this.LIZLLL = i4;
                            Integer LJI3 = C79045V0n.LJI(R.attr.cf, context);
                            if (LJI3 != null) {
                                i5 = LJI3.intValue();
                            } else {
                                i5 = 0;
                            }
                            this.LJ = i5;
                        } else {
                            Integer LJI4 = C79045V0n.LJI(R.attr.bfr, context);
                            if (LJI4 != null) {
                                i2 = LJI4.intValue();
                            } else {
                                i2 = 0;
                            }
                            this.LIZLLL = i2;
                            Integer LJI5 = C79045V0n.LJI(R.attr.bfs, context);
                            if (LJI5 != null) {
                                i3 = LJI5.intValue();
                            } else {
                                i3 = 0;
                            }
                            this.LJ = i3;
                        }
                        Integer LJI6 = C79045V0n.LJI(R.attr.bu, context);
                        this.LJFF = LJI6 != null ? LJI6.intValue() : 0;
                    }
                }

                @Override // X.InterfaceC87736Yc0
                public final SpannableStringBuilder LIZIZ(int i, int i2, CharSequence charSequence) {
                    SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
                    valueOf.setSpan(new MarkDownBulletSpan(i, this.LIZJ, i2), 0, valueOf.length(), 33);
                    return valueOf;
                }
            }).LIZ();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }
}
