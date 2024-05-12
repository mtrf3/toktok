package X;

import Y.ACListenerS23S0100000_3;
import Y.ARunnableS39S0100000_3;
import android.content.Context;
import android.text.BidiFormatter;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.SubscriptSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.challenge.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.qna.services.QnaService;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7Yk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C187747Yk extends LinearLayout {
    public final TuxTextView LJLIL;
    public final C187777Yn LJLILLLLZI;
    public final TuxTextView LJLJI;
    public final TuxTextView LJLJJI;
    public final LinearLayout LJLJJL;
    public final FrameLayout LJLJJLL;
    public String LJLJL;
    public int LJLJLJ;
    public SpannableStringBuilder LJLJLLL;
    public int LJLL;
    public SpannableStringBuilder LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public final C59948Nfs LJZ;
    public final TuxTextView LJZI;
    public Aweme LJZL;
    public C173966sC LL;
    public Integer LLD;
    public Integer LLF;
    public int LLFF;
    public boolean LLFFF;
    public boolean LLFII;
    public InterfaceC65784Pro<C76800UCe> LLFZ;
    public boolean LLI;
    public final boolean LLIFFJFJJ;
    public SpannableStringBuilder LLII;
    public List<? extends TextExtraStruct> LLIIII;
    public String[] LLIIIILZ;
    public int LLIIIJ;
    public int LLIIIL;
    public boolean LLIIIZ;
    public int LLIIJI;

    private final SpannableStringBuilder getEndOmitTextAndTime() {
        Aweme aweme = this.LJZL;
        if (aweme != null) {
            long createTime = aweme.getCreateTime() * 1000;
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            String LIZ = C7G5.LIZ(createTime, context);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) "...");
            append.append((CharSequence) LIZ);
            append.setSpan(new C156786Di(C17N.LJIILL(12.0d), getTimeStampTextColor()), 3, LIZ.length() + 3, 33);
            return spannableStringBuilder;
        }
        o.LJIJI("aweme");
        throw null;
    }

    private final CharSequence getPostTime() {
        SubscriptSpan subscriptSpan = new SubscriptSpan();
        Aweme aweme = this.LJZL;
        if (aweme != null) {
            long createTime = aweme.getCreateTime() * 1000;
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            String LIZ = C7G5.LIZ(createTime, context);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LIZ).setSpan(new C156786Di(C17N.LJIILL(12.0d), getTimeStampTextColor()), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(subscriptSpan, 0, spannableStringBuilder.length(), 33);
            return spannableStringBuilder;
        }
        o.LJIJI("aweme");
        throw null;
    }

    private final CharSequence getEndTextWhenTruncated() {
        SpannableStringBuilder append = getEndOmitTextAndTime().append("   ").append((CharSequence) getContext().getString(R.string.gdr));
        o.LJIIIIZZ(append, "getEndOmitTextAndTime().…g.feed_caption_see_more))");
        return append;
    }

    private final int getTimeStampTextColor() {
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        Integer LJI = C79045V0n.LJI(R.attr.gv, context);
        if (LJI != null) {
            return LJI.intValue();
        }
        return 0;
    }

    public final boolean getEnableToggle() {
        return this.LLFFF;
    }

    public final Integer getExtraBackgroundSpanColor() {
        return this.LLF;
    }

    public final int getMaxLinesWhenFold() {
        return this.LLFF;
    }

    public final InterfaceC65784Pro<C76800UCe> getSpanClickInterceptor() {
        return this.LLFZ;
    }

    public final Integer getTextColor() {
        return this.LLD;
    }

    public final boolean getUnableClickSpan() {
        return this.LLFII;
    }

    public static void LIZIZ(String str) {
        C71Y.LIZ("CommentDescView", str);
    }

    public final boolean LIZLLL(TextExtraStruct textExtraStruct) {
        int i;
        SpannableStringBuilder spannableStringBuilder = this.LLII;
        if (spannableStringBuilder != null) {
            i = spannableStringBuilder.length();
        } else {
            i = 0;
        }
        Aweme aweme = this.LJZL;
        if (aweme != null) {
            int max = Math.max(i, aweme.getDesc().length());
            Aweme aweme2 = this.LJZL;
            if (aweme2 != null) {
                if (aweme2.getDesc() == null || textExtraStruct.getStart() < 0 || textExtraStruct.getEnd() < 0 || textExtraStruct.getEnd() > max || textExtraStruct.getStart() >= max || textExtraStruct.getStart() >= textExtraStruct.getEnd()) {
                    return false;
                }
                return true;
            }
            o.LJIJI("aweme");
            throw null;
        }
        o.LJIJI("aweme");
        throw null;
    }

    public final void LJ(Aweme aweme) {
        Context context;
        int lineCount;
        int i;
        int i2 = this.LLIIJI;
        if (i2 == 0 || (context = getContext()) == null) {
            return;
        }
        int LIZ = C187867Yw.LIZ();
        getEndTextWhenTruncated().toString().getClass();
        if (this.LJLILLLLZI.getLineCount() == 0) {
            lineCount = LIZ;
        } else {
            lineCount = this.LJLILLLLZI.getLineCount();
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("descLineCount: ");
        LIZ2.append(lineCount);
        LIZ2.append(", maxLines: ");
        LIZ2.append(LIZ);
        LIZIZ(X1D.LIZIZ(LIZ2));
        LIZIZ(this.LJLILLLLZI.getText().toString());
        if (lineCount > LIZ) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(' ');
            LIZ3.append(context.getString(R.string.gdq));
            X1D.LIZIZ(LIZ3);
            final boolean z = false;
            if (this.LJLILLLLZI.getLayout() != null) {
                int i3 = LIZ - 1;
                this.LJLILLLLZI.getLayout().getLineStart(i3);
                i = this.LJLILLLLZI.getLayout().getLineEnd(i3);
            } else {
                i = 0;
            }
            CharSequence text = this.LJLILLLLZI.getText();
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("Desc more than 4 lines, lineCount is ");
            LIZ4.append(this.LJLILLLLZI.getLineCount());
            LIZ4.append("content is ");
            LIZ4.append((Object) text);
            LIZIZ(X1D.LIZIZ(LIZ4));
            final boolean z2 = true;
            int i4 = LIZ - 1;
            this.LJLLILLLL = this.LJLILLLLZI.getLayout().getLineBottom(i4) - this.LJLILLLLZI.getLayout().getLineTop(0);
            this.LJLL = this.LJLILLLLZI.getLayout().getLineBottom(lineCount - 1) - this.LJLILLLLZI.getLayout().getLineTop(0);
            this.LJLLJ = this.LJLILLLLZI.getLayout().getLineBottom(i4) - this.LJLILLLLZI.getLayout().getLineTop(i4);
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("hhhheight 3 descFullTextHeight: ");
            LIZ5.append(this.LJLL);
            LIZ5.append("  descTruncatedTextHeight:");
            LIZ5.append(this.LJLLILLLL);
            LIZIZ(X1D.LIZIZ(LIZ5));
            C78886Uxe.LJJLIIIJ(this.LJLLJ, this.LJLJJL);
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append("hhhheight 3 mToggleLayoutHeight: ");
            LIZ6.append(this.LJLLJ);
            LIZIZ(X1D.LIZIZ(LIZ6));
            if (text instanceof SpannableString) {
                if (i == 0) {
                    text.length();
                }
                final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
                final SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(SpannableString.valueOf(text));
                this.LJLILLLLZI.setLines(C187867Yw.LIZ());
                SpannableStringBuilder spannableStringBuilder3 = this.LLII;
                if (spannableStringBuilder3 != null) {
                    spannableStringBuilder3.append(getPostTime());
                    Aweme aweme2 = this.LJZL;
                    if (aweme2 != null) {
                        aweme2.setCaptionReturnCount(this.LLIIIL);
                        Aweme aweme3 = this.LJZL;
                        if (aweme3 != null) {
                            aweme3.setCaptionLength(this.LLIIIJ);
                            try {
                                lineCount = new StaticLayout(spannableStringBuilder3, this.LJLILLLLZI.getPaint(), this.LJLILLLLZI.getWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount();
                            } catch (Exception unused) {
                            }
                            spannableStringBuilder2 = spannableStringBuilder3;
                        } else {
                            o.LJIJI("aweme");
                            throw null;
                        }
                    } else {
                        o.LJIJI("aweme");
                        throw null;
                    }
                }
                final boolean isAd = aweme.isAd();
                if (!this.LLFFF) {
                    C78886Uxe.LJJLIIIJILLIZJL(this.LJLJJL);
                } else {
                    C188727au c188727au = new C188727au();
                    C173966sC c173966sC = this.LL;
                    if (c173966sC != null) {
                        String str = c173966sC.enterFrom;
                        String str2 = "";
                        if (str == null) {
                            str = "";
                        }
                        c188727au.LJIIIZ("enter_from", str);
                        C173966sC c173966sC2 = this.LL;
                        if (c173966sC2 != null) {
                            String str3 = c173966sC2.awemeId;
                            if (str3 == null) {
                                str3 = "";
                            }
                            c188727au.LJIIIZ("group_id", str3);
                            C173966sC c173966sC3 = this.LL;
                            if (c173966sC3 != null) {
                                String str4 = c173966sC3.authorUid;
                                if (str4 != null) {
                                    str2 = str4;
                                }
                                c188727au.LJIIIZ("author_id", str2);
                                c188727au.LJIIIZ("local_time_ms", String.valueOf(System.currentTimeMillis()));
                                FMX.LJIIL("see_more_show", c188727au.LIZ);
                                this.LJLLLL = true;
                                C78886Uxe.LJJLIIIJJI(this.LJLJJL);
                                C78886Uxe.LJJLIIIJJI(this.LJLJJI);
                                this.LJLLL = this.LJLJI.getHeight();
                                AbstractC187797Yp abstractC187797Yp = new AbstractC187797Yp(this, spannableStringBuilder2, z2, isAd) { // from class: X.7Yo
                                    public final SpannableStringBuilder LJLILLLLZI;
                                    public final boolean LJLJI;
                                    public final boolean LJLJJI;
                                    public final WeakReference<C187747Yk> LJLJJL;

                                    @Override // android.text.style.ClickableSpan
                                    public final void onClick(View widget) {
                                        o.LJIIIZ(widget, "widget");
                                        C187747Yk c187747Yk = this.LJLJJL.get();
                                        if (c187747Yk != null) {
                                            if (this.LJLJJI) {
                                                Aweme aweme4 = c187747Yk.LJZL;
                                                if (aweme4 != null) {
                                                    boolean LJLJJL = C63081OpJ.LJLJJL(aweme4);
                                                    Aweme aweme5 = c187747Yk.LJZL;
                                                    if (aweme5 != null) {
                                                        if (!aweme5.isAd() && LJLJJL) {
                                                            C26045AKb c26045AKb = new C26045AKb(c187747Yk.LJLILLLLZI);
                                                            c26045AKb.LJIIIIZZ(R.string.b95);
                                                            c26045AKb.LJIIJ();
                                                            return;
                                                        }
                                                        V9W LJIJI = C73340SqO.LJIJI();
                                                        Context context2 = c187747Yk.getContext();
                                                        Aweme aweme6 = c187747Yk.LJZL;
                                                        if (aweme6 != null) {
                                                            C187817Yr c187817Yr = new C74R() { // from class: X.7Yr
                                                            };
                                                            LJIJI.getClass();
                                                            NOE.LJJIIJ(context2, aweme6, 1, c187817Yr);
                                                            return;
                                                        }
                                                        o.LJIJI("aweme");
                                                        throw null;
                                                    }
                                                    o.LJIJI("aweme");
                                                    throw null;
                                                }
                                                o.LJIJI("aweme");
                                                throw null;
                                            }
                                            c187747Yk.LIZJ(this.LJLILLLLZI, this.LJLJI);
                                        }
                                    }

                                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                                    public final void updateDrawState(TextPaint ds) {
                                        o.LJIIIZ(ds, "ds");
                                        ds.setUnderlineText(false);
                                    }

                                    {
                                        o.LJIIIZ(this, "videoDescView");
                                        this.LJLILLLLZI = spannableStringBuilder2;
                                        this.LJLJI = z2;
                                        this.LJLJJI = isAd;
                                        this.LJLJJL = new WeakReference<>(this);
                                    }
                                };
                                abstractC187797Yp.LJLIL = 0;
                                spannableStringBuilder.setSpan(abstractC187797Yp, 0, spannableStringBuilder.length(), 17);
                                AbstractC187797Yp abstractC187797Yp2 = new AbstractC187797Yp(this, spannableStringBuilder, z, isAd) { // from class: X.7Yo
                                    public final SpannableStringBuilder LJLILLLLZI;
                                    public final boolean LJLJI;
                                    public final boolean LJLJJI;
                                    public final WeakReference<C187747Yk> LJLJJL;

                                    @Override // android.text.style.ClickableSpan
                                    public final void onClick(View widget) {
                                        o.LJIIIZ(widget, "widget");
                                        C187747Yk c187747Yk = this.LJLJJL.get();
                                        if (c187747Yk != null) {
                                            if (this.LJLJJI) {
                                                Aweme aweme4 = c187747Yk.LJZL;
                                                if (aweme4 != null) {
                                                    boolean LJLJJL = C63081OpJ.LJLJJL(aweme4);
                                                    Aweme aweme5 = c187747Yk.LJZL;
                                                    if (aweme5 != null) {
                                                        if (!aweme5.isAd() && LJLJJL) {
                                                            C26045AKb c26045AKb = new C26045AKb(c187747Yk.LJLILLLLZI);
                                                            c26045AKb.LJIIIIZZ(R.string.b95);
                                                            c26045AKb.LJIIJ();
                                                            return;
                                                        }
                                                        V9W LJIJI = C73340SqO.LJIJI();
                                                        Context context2 = c187747Yk.getContext();
                                                        Aweme aweme6 = c187747Yk.LJZL;
                                                        if (aweme6 != null) {
                                                            C187817Yr c187817Yr = new C74R() { // from class: X.7Yr
                                                            };
                                                            LJIJI.getClass();
                                                            NOE.LJJIIJ(context2, aweme6, 1, c187817Yr);
                                                            return;
                                                        }
                                                        o.LJIJI("aweme");
                                                        throw null;
                                                    }
                                                    o.LJIJI("aweme");
                                                    throw null;
                                                }
                                                o.LJIJI("aweme");
                                                throw null;
                                            }
                                            c187747Yk.LIZJ(this.LJLILLLLZI, this.LJLJI);
                                        }
                                    }

                                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                                    public final void updateDrawState(TextPaint ds) {
                                        o.LJIIIZ(ds, "ds");
                                        ds.setUnderlineText(false);
                                    }

                                    {
                                        o.LJIIIZ(this, "videoDescView");
                                        this.LJLILLLLZI = spannableStringBuilder;
                                        this.LJLJI = z;
                                        this.LJLJJI = isAd;
                                        this.LJLJJL = new WeakReference<>(this);
                                    }
                                };
                                abstractC187797Yp2.LJLIL = 0;
                                spannableStringBuilder2.setSpan(abstractC187797Yp2, 0, spannableStringBuilder2.length(), 17);
                            } else {
                                o.LJIJI("mobParams");
                                throw null;
                            }
                        } else {
                            o.LJIJI("mobParams");
                            throw null;
                        }
                    } else {
                        o.LJIJI("mobParams");
                        throw null;
                    }
                }
                this.LJLLI = spannableStringBuilder;
                this.LJLJLLL = spannableStringBuilder2.append((CharSequence) "\n");
                LJI(spannableStringBuilder, false, 0);
                this.LJLILLLLZI.setWidth(i2);
                int min = Math.min(Integer.MAX_VALUE, lineCount);
                StringBuilder LIZ7 = X1D.LIZ();
                LIZ7.append("fullLinesCount: ");
                LIZ7.append(min);
                LIZIZ(X1D.LIZIZ(LIZ7));
                this.LJLILLLLZI.post(new ARunnableS39S0100000_3(this, 169));
                return;
            }
            return;
        }
        this.LJLILLLLZI.post(new ARunnableS39S0100000_3(this, 170));
    }

    public final void LJFF(boolean z) {
        boolean z2;
        boolean z3;
        int i;
        Context context = getContext();
        if (context == null) {
            return;
        }
        Aweme aweme = this.LJZL;
        if (aweme != null) {
            if (aweme.getDesc() == null) {
                return;
            }
            boolean LIZIZ = C90193gN.LIZIZ(context);
            boolean isRtl = BidiFormatter.getInstance().isRtl(aweme.getDesc());
            int i2 = 1;
            if (LIZIZ != isRtl) {
                z2 = true;
            } else {
                z2 = false;
            }
            try {
                ViewGroup.LayoutParams layoutParams = this.LJLILLLLZI.getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                if (z) {
                    if (!this.LJLZ) {
                        if (z2) {
                            if (this.LJLLLLLL) {
                                return;
                            }
                        } else if (!this.LJLLLLLL) {
                            return;
                        }
                    }
                    this.LJLZ = false;
                    if (!this.LJLLLLLL) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    this.LJLLLLLL = z3;
                    C187777Yn c187777Yn = this.LJLILLLLZI;
                    if (!isRtl) {
                        i2 = 0;
                    }
                    C16310kV.LJIIIZ(c187777Yn, i2);
                    ViewGroup.LayoutParams layoutParams3 = this.LJLJJL.getLayoutParams();
                    o.LJII(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                    LIZIZ("reverseDescLayout");
                    if (isRtl) {
                        i = 83;
                    } else {
                        i = 85;
                    }
                    layoutParams4.gravity = i;
                    this.LJLJJL.setLayoutParams(layoutParams4);
                } else if (C16310kV.LIZLLL(this.LJLILLLLZI) != LIZIZ) {
                    this.LJLZ = true;
                    C187777Yn c187777Yn2 = this.LJLILLLLZI;
                    if (!LIZIZ) {
                        i2 = 0;
                    }
                    C16310kV.LJIIIZ(c187777Yn2, i2);
                } else {
                    return;
                }
                this.LJLILLLLZI.setLayoutParams(layoutParams2);
                return;
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                return;
            }
        }
        o.LJIJI("aweme");
        throw null;
    }

    public final void setDarkMode(boolean z) {
        this.LLI = z;
    }

    public final void setEnableToggle(boolean z) {
        this.LLFFF = z;
    }

    public final void setExtraBackgroundSpanColor(Integer num) {
        this.LLF = num;
    }

    public final void setMaxLinesWhenFold(int i) {
        this.LLFF = i;
    }

    public final void setSpanClickInterceptor(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LLFZ = interfaceC65784Pro;
    }

    public final void setTextColor(Integer num) {
        this.LLD = num;
    }

    public final void setUnableClickSpan(boolean z) {
        this.LLFII = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C187747Yk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new LinkedHashMap();
        this.LJLJL = "";
        this.LLFF = 4;
        this.LLFFF = true;
        this.LLIFFJFJJ = AnonymousClass842.LIZ();
        View.inflate(getContext(), R.layout.qj, this);
        View findViewById = findViewById(R.id.bug);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.content_title)");
        this.LJLIL = (TuxTextView) findViewById;
        View findViewById2 = findViewById(R.id.desc);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.desc)");
        C187777Yn c187777Yn = (C187777Yn) findViewById2;
        this.LJLILLLLZI = c187777Yn;
        C74J.LIZJ(c187777Yn);
        c187777Yn.setSpanSize(c187777Yn.getTextSize());
        if (C1803676a.LIZ()) {
            C74J.LIZ(c187777Yn);
        }
        View findViewById3 = findViewById(R.id.mog);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.tv_toggle)");
        TuxTextView tuxTextView = (TuxTextView) findViewById3;
        this.LJLJI = tuxTextView;
        View findViewById4 = findViewById(R.id.m6_);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.tv_end_info)");
        this.LJLJJI = (TuxTextView) findViewById4;
        View findViewById5 = findViewById(R.id.lbr);
        o.LJIIIIZZ(findViewById5, "findViewById(R.id.toggle_layout)");
        LinearLayout linearLayout = (LinearLayout) findViewById5;
        this.LJLJJL = linearLayout;
        linearLayout.setLayoutDirection(0);
        View findViewById6 = findViewById(R.id.c7b);
        o.LJIIIIZZ(findViewById6, "findViewById(R.id.desc_container_fl)");
        this.LJLJJLL = (FrameLayout) findViewById6;
        View findViewById7 = findViewById(R.id.zl);
        o.LJIIIIZZ(findViewById7, "findViewById(R.id.aigc_content_label)");
        this.LJZI = (TuxTextView) findViewById7;
        o.LJIIIIZZ(findViewById(R.id.lj9), "findViewById(R.id.trans_promoted_tag_tv)");
        o.LJIIIIZZ(findViewById(R.id.ibu), "findViewById(R.id.promoted_tag_tv)");
        C88463da.LIZJ(C88463da.LIZ, tuxTextView, EnumC1796673i.BUTTON, 0.0f, 12);
        C16880lQ.LJJJJI(tuxTextView, new ACListenerS23S0100000_3(this, 245));
        View findViewById8 = findViewById(R.id.hgy);
        o.LJIIIIZZ(findViewById8, "findViewById(R.id.paid_partnership_tag_tv)");
        this.LJZ = (C59948Nfs) findViewById8;
    }

    public final void LIZJ(SpannableStringBuilder spannableStringBuilder, boolean z) {
        String str;
        int LIZ;
        if (z) {
            str = "spread";
        } else {
            str = "fold";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", this.LJLJL);
        Aweme aweme = this.LJZL;
        if (aweme != null) {
            c188727au.LJIIIZ("group_id", aweme.getAid());
            Aweme aweme2 = this.LJZL;
            if (aweme2 != null) {
                c188727au.LJIIIZ("author_id", aweme2.getAuthorUid());
                c188727au.LJIIIZ("action_type", str);
                FMX.LJIIL("video_detail", c188727au.LIZ);
                if (z) {
                    LIZ = Integer.MAX_VALUE;
                } else if (this.LJZL != null) {
                    LIZ = C187867Yw.LIZ();
                } else {
                    o.LJIJI("aweme");
                    throw null;
                }
                this.LJLILLLLZI.setMaxLines(LIZ);
                if (z) {
                    C78886Uxe.LJJLIIIJILLIZJL(this.LJLJJI);
                    this.LJLJI.setText(R.string.gdq);
                } else {
                    C78886Uxe.LJJLIIIJJI(this.LJLJJI);
                    this.LJLJI.setText(R.string.gdr);
                }
                LJI(spannableStringBuilder, z, 0);
                if (this.LJLLL == 0) {
                    this.LJLLL = this.LJLJI.getHeight();
                    return;
                }
                return;
            }
            o.LJIJI("aweme");
            throw null;
        }
        o.LJIJI("aweme");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x025b, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.feed.model.Aweme r19, X.C173966sC r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 1024
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C187747Yk.LIZ(com.ss.android.ugc.aweme.feed.model.Aweme, X.6sC, java.lang.String):void");
    }

    public final void LJI(CharSequence charSequence, boolean z, int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setDescSafely showFull:");
        LIZ.append(z);
        LIZ.append(" desc:");
        LIZ.append((Object) charSequence);
        LIZ.append(' ');
        C71Y.LIZ("xjccccccc", X1D.LIZIZ(LIZ));
        try {
            if (C187857Yv.LIZ >= 3) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("VideoDescView_setDescSafely desc:");
                LIZ2.append((Object) charSequence);
                LIZIZ(X1D.LIZIZ(LIZ2));
            }
            Aweme aweme = this.LJZL;
            if (aweme != null) {
                String descLanguage = aweme.getDescLanguage();
                Aweme aweme2 = this.LJZL;
                if (aweme2 != null) {
                    if (this.LLIFFJFJJ && this.LLII != null && aweme2.getContentDesc() != null) {
                        if (z) {
                            this.LJLILLLLZI.LJJIJLIJ(this.LLII, descLanguage);
                            Aweme aweme3 = this.LJZL;
                            if (aweme3 != null) {
                                LJII(this, aweme3, null, 0, z, 6);
                                return;
                            } else {
                                o.LJIJI("aweme");
                                throw null;
                            }
                        }
                    } else if (z) {
                        this.LJLILLLLZI.LJJIJLIJ(charSequence, descLanguage);
                        return;
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                    SpannableStringBuilder endOmitTextAndTime = getEndOmitTextAndTime();
                    this.LJLILLLLZI.LJJIJLIJ(spannableStringBuilder, descLanguage);
                    this.LJLJJI.setText(endOmitTextAndTime);
                    Aweme aweme4 = this.LJZL;
                    if (aweme4 != null) {
                        LJII(this, aweme4, Boolean.TRUE, i, false, 8);
                        return;
                    } else {
                        o.LJIJI("aweme");
                        throw null;
                    }
                }
                o.LJIJI("aweme");
                throw null;
            }
            o.LJIJI("aweme");
            throw null;
        } catch (Exception e) {
            C36922EeM.LIZ(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJII(C187747Yk c187747Yk, Aweme aweme, Boolean bool, int i, boolean z, int i2) {
        boolean z2;
        boolean z3;
        int i3;
        int LJJIFFI;
        float f;
        float f2;
        List list;
        final Boolean bool2 = bool;
        final int i4 = i;
        if ((i2 & 2) != 0) {
            bool2 = Boolean.FALSE;
        }
        if ((i2 & 4) != 0) {
            i4 = 0;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        c187747Yk.getClass();
        List textExtra = aweme.getTextExtra();
        if (c187747Yk.LJLLLL && z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c187747Yk.LLIFFJFJJ && (list = c187747Yk.LLIIII) != null && z2) {
            textExtra = list;
        }
        if (C86Z.LIZ && !aweme.isAd() && textExtra != null) {
            ORS.LJJLIL(C187767Ym.LJLIL, textExtra);
        }
        if (!aweme.isScheduleVideo()) {
            c187747Yk.LJLILLLLZI.LJJIZ(textExtra, new C187807Yq(), new InterfaceC201227v4() { // from class: X.7Yl
                @Override // X.InterfaceC201227v4
                public final boolean LIZ(TextExtraStruct struct) {
                    o.LJIIIZ(struct, "struct");
                    if (C42053Gev.LIZIZ.LJ(struct) || (o.LJ(bool2, Boolean.TRUE) && (struct.getStart() > i4 || struct.getEnd() > i4))) {
                        return true;
                    }
                    return false;
                }
            });
        }
        CommerceChallengeServiceImpl.LIZIZ().LJIIZILJ(c187747Yk.LJLILLLLZI, aweme, c187747Yk.LJLJL);
        if (textExtra != null && !TextUtils.isEmpty(aweme.getDesc())) {
            for (TextExtraStruct textExtraStruct : textExtra) {
                int end = textExtraStruct.getEnd();
                Boolean bool3 = Boolean.TRUE;
                if (!o.LJ(bool2, bool3) || textExtraStruct.getStart() < i4) {
                    if (o.LJ(bool2, bool3) && textExtraStruct.getStart() < i4 && textExtraStruct.getEnd() > i4) {
                        end = i4;
                    }
                    if (c187747Yk.LIZLLL(textExtraStruct) && ((textExtraStruct.getType() == 0 && ((!TextUtils.isEmpty(textExtraStruct.getAwemeId()) || 2 == textExtraStruct.getSubtype() || ((5 == textExtraStruct.getSubtype() || 7 == textExtraStruct.getSubtype()) && QnaService.LIZ().enablePublicQna())) && aweme.getDesc().charAt(textExtraStruct.getStart()) == '@')) || C42053Gev.LIZIZ.LIZ.LJFF(textExtraStruct))) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        if (C87026YDm.LIZJ()) {
                            LJJIFFI = 0;
                        } else {
                            Integer num = c187747Yk.LLF;
                            if (num != null) {
                                LJJIFFI = num.intValue();
                            } else {
                                Context context = c187747Yk.getContext();
                                o.LJIIIIZZ(context, "context");
                                LJJIFFI = C78886Uxe.LJJIFFI(R.attr.cg, R.color.am, context);
                            }
                        }
                        Context context2 = c187747Yk.getContext();
                        o.LJIIIIZZ(context2, "context");
                        float round = Math.round(KL2.LJIIJJI(c187747Yk.getContext()) - KL2.LIZJ(c187747Yk.getContext(), 85.0f));
                        Context context3 = c187747Yk.getContext();
                        o.LJIIIIZZ(context3, "context");
                        C8F5 c8f5 = new C8F5(context2, round, LJJIFFI, C78886Uxe.LJJIFFI(R.attr.go, R.color.ck, context3), textExtraStruct, !c187747Yk.LLI, false, C87026YDm.LIZJ(), false, 320);
                        Context context4 = c187747Yk.getContext();
                        if (C87026YDm.LIZJ()) {
                            f = 8.0f;
                        } else {
                            f = 12.0f;
                        }
                        c8f5.LJLLI = KL2.LIZJ(context4, f);
                        c8f5.LJLLILLLL = KL2.LIZJ(c187747Yk.getContext(), 2.0f);
                        Context context5 = c187747Yk.getContext();
                        if (C87026YDm.LIZJ()) {
                            f2 = 15.0f;
                        } else {
                            f2 = 13.0f;
                        }
                        c8f5.LJLJLLL = KL2.LIZJ(context5, f2);
                        c187747Yk.LJLILLLLZI.LJJIL(textExtraStruct.getStart(), end, c8f5);
                        if (4 == textExtraStruct.getSubtype()) {
                            C188727au c188727au = new C188727au();
                            c188727au.LJIIIZ("enter_from", c187747Yk.LJLJL);
                            Aweme aweme2 = c187747Yk.LJZL;
                            if (aweme2 != null) {
                                c188727au.LJIIIZ("group_id", aweme2.getAid());
                                Aweme aweme3 = c187747Yk.LJZL;
                                if (aweme3 != null) {
                                    c188727au.LJIIIZ("author_id", aweme3.getAuthorUid());
                                    Aweme aweme4 = c187747Yk.LJZL;
                                    if (aweme4 != null) {
                                        c188727au.LJIIIZ("music_id", C227768wm.LJIIJJI(aweme4));
                                        FMX.LJIIL("duet_with_show", c188727au.LIZ);
                                    } else {
                                        o.LJIJI("aweme");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("aweme");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("aweme");
                                throw null;
                            }
                        }
                    }
                    if (textExtraStruct.getType() == 1 && textExtraStruct.getSubtype() == 15) {
                        C187777Yn c187777Yn = c187747Yk.LJLILLLLZI;
                        int start = textExtraStruct.getStart();
                        int end2 = textExtraStruct.getEnd();
                        Context context6 = c187747Yk.getContext();
                        o.LJIIIIZZ(context6, "context");
                        Integer LJI = C79045V0n.LJI(R.attr.gx, context6);
                        if (LJI != null) {
                            i3 = LJI.intValue();
                        } else {
                            i3 = -1;
                        }
                        c187777Yn.LJJIL(start, end2, new ForegroundColorSpan(i3));
                        C188727au c188727au2 = new C188727au();
                        c188727au2.LJIIIZ("video_id", aweme.getAid());
                        c188727au2.LJIIIZ("challenge_id", textExtraStruct.getCid());
                        FMX.LJIIL("hashtag_removal_video_tag_show", c188727au2.LIZ);
                    }
                }
            }
        }
        c187747Yk.LJLILLLLZI.setAdHashTag(aweme);
    }
}
