package X;

import Y.ARunnableS48S0100000_12;
import Y.IDCSpanS33S0100000_8;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ReplacementSpan;
import android.text.style.StyleSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.challenge.service.ChallengeDetailProvider;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.model.ChallengeAnnouncement;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes13.dex */
public final class T5C extends T5F {
    public TextView LLFZ;
    public TextView LLI;
    public View LLIFFJFJJ;
    public View LLII;
    public View LLIIII;
    public TextView LLIIIILZ;
    public View LLIIIJ;
    public T5N LLIIIL;

    @Override // X.T5F
    public int getLayoutResId() {
        return R.layout.vw;
    }

    @Override // X.T5F
    public final void LIZIZ() {
        T5G LIZ = ChallengeDetailProvider.LJ().LIZ();
        o.LJIIIIZZ(LIZ, "get().getService(IChalle…eCommerceHeaderDelegate()");
        ((ArrayList) this.LJZI).add(LIZ);
    }

    @Override // X.T5F
    public final void LIZJ() {
        View findViewById = findViewById(R.id.a9i);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.attrs_container)");
        ViewStub viewStub = (ViewStub) findViewById;
        viewStub.setLayoutResource(getAttrsResId());
        View inflate = viewStub.inflate();
        View findViewById2 = inflate.findViewById(R.id.a9l);
        o.LJIIIIZZ(findViewById2, "container.findViewById(R.id.attrs_link)");
        this.LLFZ = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.a9j);
        o.LJIIIIZZ(findViewById3, "container.findViewById(R.id.attrs_first)");
        this.LLI = (TextView) findViewById3;
        this.LLIFFJFJJ = inflate;
        View findViewById4 = findViewById(R.id.b21);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.button_container)");
        ViewStub viewStub2 = (ViewStub) findViewById4;
        viewStub2.setLayoutResource(getButtonResId());
        View inflate2 = viewStub2.inflate();
        View findViewById5 = inflate2.findViewById(R.id.bgz);
        o.LJIIIIZZ(findViewById5, "container.findViewById(R.id.collect_container)");
        View findViewById6 = inflate2.findViewById(R.id.f0q);
        o.LJIIIIZZ(findViewById6, "container.findViewById(R.id.iv_collect)");
        this.LLIIIL = new T5N(findViewById5, (T5P) findViewById6, (TextView) inflate2.findViewById(R.id.m2m), getDetailParam());
        this.LLII = inflate2;
        super.LIZJ();
    }

    @Override // X.T5F
    public int getAttrsResId() {
        int i = C46498IMs.LIZ[getMHeaderParam().LIZIZ.ordinal()];
        if (i == 1 || i == 2) {
            return R.layout.vq;
        }
        throw new C162476Zf();
    }

    @Override // X.T5F
    public int getButtonResId() {
        int i = C46498IMs.LIZIZ[getMHeaderParam().LIZJ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return R.layout.vs;
            }
            throw new C162476Zf();
        }
        return R.layout.vr;
    }

    @Override // X.T5F
    public final void LIZ(ChallengeDetail challengeDetail) {
        String nickname;
        boolean z;
        String ellipsizeText;
        Integer num;
        String str;
        boolean z2;
        boolean z3;
        int i;
        float f;
        int i2;
        int i3;
        if (challengeDetail.challenge == null) {
            return;
        }
        super.LIZ(challengeDetail);
        String LJJIIJ = C77123UOp.LJJIIJ(getMChallenge().getDisplayCount());
        C116724i4 c116724i4 = new C116724i4();
        String quantityString = getContext().getResources().getQuantityString(R.plurals.ga, (int) getMChallenge().getDisplayCount(), LJJIIJ);
        o.LJIIIIZZ(quantityString, "context.resources.getQua…layCount.toInt(), number)");
        c116724i4.LIZIZ(quantityString);
        C116714i3 c116714i3 = c116724i4.LIZ;
        TextView textView = this.LLI;
        if (textView != null) {
            textView.setText(c116714i3);
            TextView textView2 = this.LLFZ;
            if (textView2 != null) {
                textView2.setVisibility(8);
                if (getMChallenge().isCommerce() && getMChallenge().getAuthor() != null && (nickname = getMChallenge().getAuthor().getNickname()) != null && nickname.length() != 0) {
                    TextView textView3 = this.LLFZ;
                    if (textView3 != null) {
                        textView3.setVisibility(0);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        boolean LJL = V1B.LJL(getMChallenge().getSponsorLabelText());
                        if (V1B.LJL(getMChallenge().getSponsorAdLabel()) && !LJL) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (LJL) {
                            ellipsizeText = getMChallenge().getSponsorLabelText();
                        } else if (V1B.LJL(getMChallenge().getSponsorAdLabel())) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append(getMChallenge().getSponsorAdLabel());
                            LIZ.append(getContext().getResources().getString(R.string.rhe));
                            LIZ.append(getContext().getResources().getString(R.string.rhe));
                            LIZ.append(getMChallenge().getAuthor().getNickname());
                            ellipsizeText = X1D.LIZIZ(LIZ);
                        } else {
                            ellipsizeText = getMChallenge().getAuthor().getNickname();
                        }
                        if (LJL) {
                            o.LJIIIIZZ(ellipsizeText, "ellipsizeText");
                            String nickname2 = getMChallenge().getAuthor().getNickname();
                            o.LJIIIIZZ(nickname2, "mChallenge.author.nickname");
                            num = Integer.valueOf(s.LJJLIIIJL(ellipsizeText, nickname2, 0, false, 6));
                        } else {
                            num = null;
                        }
                        User author = getMChallenge().getAuthor();
                        if (author != null) {
                            str = author.getSecUid();
                        } else {
                            str = null;
                        }
                        if (V1B.LJL(str)) {
                            if (getMChallenge().getAuthor().getCommerceUserLevel() == 2) {
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append(ellipsizeText);
                                LIZ2.append(getContext().getResources().getString(R.string.rhe));
                                ellipsizeText = X1D.LIZIZ(LIZ2);
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            z3 = true;
                        } else {
                            z2 = false;
                            z3 = false;
                        }
                        o.LJIIIIZZ(ellipsizeText, "ellipsizeText");
                        if (z) {
                            i = 1;
                        } else {
                            i = 2;
                        }
                        int LJIIIIZZ = C60996Nwm.LJIIIIZZ(getContext()) - ((int) KL2.LIZJ(getContext(), 168.0f));
                        if (z) {
                            f = KL2.LIZJ(getContext(), 10.0f);
                        } else {
                            f = 0.0f;
                        }
                        if (z3) {
                            f += KL2.LIZJ(getContext(), 10.0f);
                            if (z2) {
                                f += KL2.LIZJ(getContext(), 10.0f);
                            }
                        }
                        TextView textView4 = this.LLFZ;
                        if (textView4 != null) {
                            DynamicLayout dynamicLayout = new DynamicLayout(ellipsizeText, textView4.getPaint(), LJIIIIZZ, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                            int lineCount = dynamicLayout.getLineCount();
                            if (lineCount >= i) {
                                int i4 = i - 1;
                                ellipsizeText = ellipsizeText.subSequence(0, dynamicLayout.getLineEnd(i4)).toString();
                                if (lineCount > i) {
                                    ellipsizeText = LJ(ellipsizeText.length() - 2, ellipsizeText, z2);
                                    TextView textView5 = this.LLFZ;
                                    if (textView5 != null) {
                                        dynamicLayout = new DynamicLayout(ellipsizeText, textView5.getPaint(), LJIIIIZZ, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                                    } else {
                                        o.LJIJI("mAttrsLink");
                                        throw null;
                                    }
                                }
                                while (dynamicLayout.getLineCount() > i) {
                                    ellipsizeText = LJ(ellipsizeText.length() - 5, ellipsizeText, z2);
                                    TextView textView6 = this.LLFZ;
                                    if (textView6 != null) {
                                        dynamicLayout = new DynamicLayout(ellipsizeText, textView6.getPaint(), LJIIIIZZ, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                                    } else {
                                        o.LJIJI("mAttrsLink");
                                        throw null;
                                    }
                                }
                                float f2 = LJIIIIZZ;
                                TextView textView7 = this.LLFZ;
                                if (textView7 != null) {
                                    float measureText = f2 - textView7.getPaint().measureText(ellipsizeText, dynamicLayout.getLineStart(i4), dynamicLayout.getLineEnd(i4));
                                    if (dynamicLayout.getLineCount() == i && measureText < f) {
                                        ellipsizeText = LJ(ellipsizeText.length() - 2, ellipsizeText, z2);
                                        TextView textView8 = this.LLFZ;
                                        if (textView8 != null) {
                                            DynamicLayout dynamicLayout2 = new DynamicLayout(ellipsizeText, textView8.getPaint(), LJIIIIZZ, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                                            while (dynamicLayout2.getLineCount() > i) {
                                                ellipsizeText = LJ(ellipsizeText.length() - 5, ellipsizeText, z2);
                                                TextView textView9 = this.LLFZ;
                                                if (textView9 != null) {
                                                    dynamicLayout2 = new DynamicLayout(ellipsizeText, textView9.getPaint(), LJIIIIZZ, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                                                } else {
                                                    o.LJIJI("mAttrsLink");
                                                    throw null;
                                                }
                                            }
                                        } else {
                                            o.LJIJI("mAttrsLink");
                                            throw null;
                                        }
                                    }
                                    while (measureText < f) {
                                        ellipsizeText = LJ(ellipsizeText.length() - 5, ellipsizeText, z2);
                                        TextView textView10 = this.LLFZ;
                                        if (textView10 != null) {
                                            DynamicLayout dynamicLayout3 = new DynamicLayout(ellipsizeText, textView10.getPaint(), LJIIIIZZ, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                                            TextView textView11 = this.LLFZ;
                                            if (textView11 != null) {
                                                measureText = f2 - textView11.getPaint().measureText(ellipsizeText, dynamicLayout3.getLineStart(i4), dynamicLayout3.getLineEnd(i4));
                                            } else {
                                                o.LJIJI("mAttrsLink");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("mAttrsLink");
                                            throw null;
                                        }
                                    }
                                } else {
                                    o.LJIJI("mAttrsLink");
                                    throw null;
                                }
                            }
                            spannableStringBuilder.append((CharSequence) ellipsizeText);
                            if (z) {
                                final Context context = getContext();
                                final int LIZIZ = C04330Ez.LIZIZ(getContext(), R.color.am);
                                final String sponsorAdLabel = getMChallenge().getSponsorAdLabel();
                                final int LIZIZ2 = C04330Ez.LIZIZ(getContext(), R.color.cv);
                                spannableStringBuilder.setSpan(new ReplacementSpan(context, LIZIZ, LIZIZ2, sponsorAdLabel) { // from class: X.6Dg
                                    public String LJLIL;
                                    public float LJLILLLLZI;
                                    public final float LJLJI;
                                    public float LJLJJI;
                                    public float LJLJJL;
                                    public float LJLJJLL;
                                    public float LJLJL;
                                    public int LJLJLJ;
                                    public int LJLJLLL;

                                    {
                                        float f3;
                                        if (TextUtils.isEmpty(sponsorAdLabel)) {
                                            return;
                                        }
                                        Context LLLLL = C16880lQ.LLLLL(context);
                                        this.LJLJLJ = LIZIZ;
                                        this.LJLIL = sponsorAdLabel;
                                        float applyDimension = TypedValue.applyDimension(1, 1.0f, LLLLL.getResources().getDisplayMetrics());
                                        this.LJLJL = applyDimension;
                                        this.LJLILLLLZI = 16.0f * applyDimension;
                                        this.LJLJJI = applyDimension * 4.0f;
                                        this.LJLJJLL = 10.0f * applyDimension;
                                        this.LJLJLLL = LIZIZ2;
                                        this.LJLJJL = applyDimension * 3.0f;
                                        if (sponsorAdLabel.length() > 1) {
                                            Rect rect = new Rect();
                                            Paint paint = new Paint();
                                            paint.setTextSize(this.LJLJJLL);
                                            paint.getTextBounds(sponsorAdLabel, 0, sponsorAdLabel.length(), rect);
                                            f3 = (this.LJLJL * 4.0f * 2.0f) + rect.width();
                                        } else {
                                            f3 = this.LJLILLLLZI;
                                        }
                                        this.LJLJI = f3;
                                    }

                                    @Override // android.text.style.ReplacementSpan
                                    public final int getSize(Paint paint, CharSequence charSequence, int i5, int i6, Paint.FontMetricsInt fontMetricsInt) {
                                        return (int) (this.LJLJI + this.LJLJJL);
                                    }

                                    @Override // android.text.style.ReplacementSpan
                                    public final void draw(Canvas canvas, CharSequence charSequence, int i5, int i6, float f3, int i7, int i8, int i9, Paint paint) {
                                        float f4;
                                        Paint paint2 = new Paint();
                                        paint2.setColor(this.LJLJLJ);
                                        paint2.setStyle(Paint.Style.FILL);
                                        paint2.setAntiAlias(true);
                                        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
                                        float f5 = fontMetrics.descent;
                                        float f6 = fontMetrics.ascent;
                                        float f7 = (((f5 - f6) - this.LJLILLLLZI) / 2.0f) + i8 + f6;
                                        if (f3 != 0.0f) {
                                            f4 = this.LJLJJL + f3;
                                        } else {
                                            f4 = f3;
                                        }
                                        RectF rectF = new RectF(f4, f7, this.LJLJI + f4, this.LJLILLLLZI + f7);
                                        float f8 = this.LJLJJI;
                                        canvas.drawRoundRect(rectF, f8, f8, paint2);
                                        TextPaint textPaint = new TextPaint();
                                        textPaint.setTextSize(this.LJLJJLL);
                                        textPaint.setColor(this.LJLJLLL);
                                        T5S t5s = new T5S();
                                        t5s.LIZ(82);
                                        textPaint.setTypeface(t5s.getTypeface());
                                        textPaint.setAntiAlias(true);
                                        Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
                                        if (f3 != 0.0f) {
                                            f3 += this.LJLJJL;
                                        }
                                        RectF rectF2 = new RectF(f3, f7, this.LJLJI + f3, this.LJLILLLLZI + f7);
                                        int i10 = (int) ((((rectF2.bottom + rectF2.top) - fontMetricsInt.bottom) - fontMetricsInt.top) / 2.0f);
                                        String str2 = this.LJLIL;
                                        float f9 = this.LJLJL;
                                        float f10 = (4.0f * f9) + f3;
                                        float f11 = f9 * 0.5f;
                                        canvas.drawText(str2, f10 - f11, i10 - f11, textPaint);
                                    }
                                }, 0, getMChallenge().getSponsorAdLabel().length(), 33);
                            }
                            if (z2) {
                                TextView textView12 = this.LLFZ;
                                if (textView12 != null) {
                                    T59 t59 = new T59(textView12.getContext(), R.drawable.a_a);
                                    spannableStringBuilder.append((CharSequence) ".");
                                    spannableStringBuilder.setSpan(t59, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                                } else {
                                    o.LJIJI("mAttrsLink");
                                    throw null;
                                }
                            }
                            if (z3) {
                                Drawable drawable = getContext().getResources().getDrawable(R.drawable.a_b);
                                if (C90193gN.LIZ()) {
                                    drawable = getContext().getResources().getDrawable(R.drawable.a__);
                                }
                                drawable.setBounds(0, 0, (int) KL2.LIZJ(getContext(), 10.0f), (int) KL2.LIZJ(getContext(), 10.0f));
                                T59 t592 = new T59(drawable);
                                spannableStringBuilder.append((CharSequence) ".");
                                spannableStringBuilder.setSpan(t592, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            }
                            if (LJL && num != null && num.intValue() > -1) {
                                spannableStringBuilder.setSpan(new StyleSpan(1), Math.min(num.intValue(), spannableStringBuilder.length() - 1), Math.min(getMChallenge().getAuthor().getNickname().length() + num.intValue(), spannableStringBuilder.length()), 33);
                            }
                            if (z3) {
                                IDCSpanS33S0100000_8 iDCSpanS33S0100000_8 = new IDCSpanS33S0100000_8(this, 1);
                                if (z) {
                                    i2 = 1 + getMChallenge().getSponsorAdLabel().length();
                                } else {
                                    i2 = 0;
                                }
                                spannableStringBuilder.setSpan(iDCSpanS33S0100000_8, i2, spannableStringBuilder.length(), 33);
                                TextView textView13 = this.LLFZ;
                                if (textView13 != null) {
                                    textView13.setMovementMethod(LinkMovementMethod.getInstance());
                                } else {
                                    o.LJIJI("mAttrsLink");
                                    throw null;
                                }
                            }
                            TextView textView14 = this.LLFZ;
                            if (textView14 != null) {
                                textView14.setText(spannableStringBuilder);
                            } else {
                                o.LJIJI("mAttrsLink");
                                throw null;
                            }
                        } else {
                            o.LJIJI("mAttrsLink");
                            throw null;
                        }
                    } else {
                        o.LJIJI("mAttrsLink");
                        throw null;
                    }
                }
                T5N t5n = this.LLIIIL;
                if (t5n != null) {
                    t5n.LIZ(getMHeaderParam(), getMChallenge());
                    View view = this.LLII;
                    if (view != null) {
                        view.post(new ARunnableS48S0100000_12(this, 85));
                        ChallengeAnnouncement challengeAnnouncement = getMChallenge().getChallengeAnnouncement();
                        if (challengeAnnouncement != null) {
                            String title = challengeAnnouncement.getTitle();
                            String content = challengeAnnouncement.getContent();
                            if (!TextUtils.isEmpty(title) && !TextUtils.isEmpty(content)) {
                                if (this.LLIIII == null) {
                                    View inflate = ((ViewStub) findViewById(R.id.nev)).inflate();
                                    o.LJII(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
                                    C74065T4z c74065T4z = new C74065T4z();
                                    View findViewById = inflate.findViewById(R.id.new);
                                    o.LJIIIIZZ(findViewById, "container.findViewById(R…nt_description_container)");
                                    c74065T4z.LJI((ViewStub) findViewById);
                                    Challenge mChallenge = getMChallenge();
                                    if (mChallenge != null) {
                                        c74065T4z.LIZ(2, content, new C8D0(c74065T4z, mChallenge));
                                    }
                                    this.LLIIII = inflate;
                                    View findViewById2 = findViewById(R.id.b8n);
                                    o.LJIIIIZZ(findViewById2, "findViewById(R.id.challenge_announcement_title)");
                                    this.LLIIIILZ = (TextView) findViewById2;
                                    View findViewById3 = findViewById(R.id.fs2);
                                    o.LJIIIIZZ(findViewById3, "findViewById(R.id.line_divider)");
                                    this.LLIIIJ = findViewById3;
                                }
                                View view2 = this.LLIIIJ;
                                if (view2 != null) {
                                    if (TextUtils.isEmpty(getMChallenge().getDesc())) {
                                        i3 = 8;
                                    } else {
                                        i3 = 0;
                                    }
                                    view2.setVisibility(i3);
                                    TextView textView15 = this.LLIIIILZ;
                                    if (textView15 != null) {
                                        textView15.setText(title);
                                        View view3 = this.LLIIII;
                                        o.LJI(view3);
                                        view3.setVisibility(0);
                                        return;
                                    }
                                    o.LJIJI("mAnnounceTitle");
                                    throw null;
                                }
                                o.LJIJI("mAnnounceDivider");
                                throw null;
                            }
                        }
                        View view4 = this.LLIIII;
                        if (view4 == null) {
                            return;
                        }
                        view4.setVisibility(8);
                        return;
                    }
                    o.LJIJI("mButtonContainer");
                    throw null;
                }
                o.LJIJI("mCollectButtonBlock");
                throw null;
            }
            o.LJIJI("mAttrsLink");
            throw null;
        }
        o.LJIJI("mAttrsFirst");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T5C(Context context, T5H t5h) {
        super(context, t5h, null);
        a1.LJFF(context, "context");
    }

    public static String LJ(int i, String str, boolean z) {
        if (z) {
            StringBuilder LIZ = X1D.LIZ();
            String substring = str.substring(0, Math.max(i - 1, 1));
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            LIZ.append(substring);
            LIZ.append("... ");
            return X1D.LIZIZ(LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        String substring2 = str.substring(0, Math.max(i, 1));
        o.LJIIIIZZ(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        LIZ2.append(substring2);
        LIZ2.append("...");
        return X1D.LIZIZ(LIZ2);
    }
}
