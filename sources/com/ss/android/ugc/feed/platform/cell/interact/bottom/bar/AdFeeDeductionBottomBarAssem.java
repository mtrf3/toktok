package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C16880lQ;
import X.C2055284u;
import X.C2059186h;
import X.C47261Igj;
import X.C55096Ljo;
import X.C62814Ol0;
import X.C89N;
import X.KL2;
import Y.ACListenerS29S0300000_3;
import android.content.Context;
import android.text.Layout;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.commercialize.model.AdDisclaimer;
import com.ss.android.ugc.aweme.commercialize.model.DisclaimerText;
import com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class AdFeeDeductionBottomBarAssem extends BaseCellSlotComponent<AdFeeDeductionBottomBarAssem> {
    public ViewGroup LLFII;
    public final AdFeeDeductionBottomBarAssem$descExpandModeProtocol$1 LLFZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.a_w;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.AdFeeDeductionBottomBarAssem$descExpandModeProtocol$1] */
    public AdFeeDeductionBottomBarAssem() {
        new LinkedHashMap();
        this.LLFZ = new DescExpandModeProtocol() { // from class: com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.AdFeeDeductionBottomBarAssem$descExpandModeProtocol$1
            @Override // com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol
            public final void I() {
            }

            @Override // com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol
            public final void LLILLJJLI() {
                AdFeeDeductionBottomBarAssem.this.Y3().setVisibility(0);
            }
        };
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C62814Ol0.LJJIIJZLJL(C55096Ljo.LJIIZILJ(this), DescExpandModeProtocol.class, C47261Igj.LJJIJIL(this.LLFZ));
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        ActivityC45651qj activityC45651qj;
        boolean z;
        AdDisclaimer disclaimer;
        AwemeRawAd awemeRawAd;
        AdDisclaimer disclaimer2;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        Aweme aweme = item.getAweme();
        o.LJIIIIZZ(aweme, "item.aweme");
        Fragment fragment = item.fragment;
        if (fragment != null) {
            activityC45651qj = fragment.mo49getActivity();
        } else {
            activityC45651qj = null;
        }
        ViewGroup viewGroup = this.LLFII;
        if (viewGroup != null) {
            C16880lQ.LJIIL(viewGroup, null);
            if (!aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null || (disclaimer2 = awemeRawAd.getDisclaimer()) == null || disclaimer2.getType() == 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                viewGroup.setVisibility(0);
                ViewGroup viewGroup2 = this.LLFII;
                if (activityC45651qj == null || viewGroup2 == null) {
                    return;
                }
                final TuxTextView tuxTextView = (TuxTextView) viewGroup2.findViewById(R.id.d6c);
                TuxIconView tuxIconView = (TuxIconView) viewGroup2.findViewById(R.id.d6d);
                AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                if (awemeRawAd2 == null || (disclaimer = awemeRawAd2.getDisclaimer()) == null) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                ViewGroup.LayoutParams layoutParams3 = tuxIconView.getLayoutParams();
                o.LJII(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                if (disclaimer.getType() == 1) {
                    C2059186h.LIZ(tuxTextView, disclaimer.getPureText());
                    viewGroup2.setBackgroundColor(0);
                    tuxIconView.setTintColorRes(R.attr.dk);
                    layoutParams2.topMargin = (int) KL2.LIZJ(activityC45651qj, 0.0f);
                    layoutParams4.topMargin = (int) KL2.LIZJ(activityC45651qj, 0.0f);
                } else if (disclaimer.getType() == 2) {
                    layoutParams2.topMargin = (int) KL2.LIZJ(activityC45651qj, 12.0f);
                    layoutParams4.topMargin = (int) KL2.LIZJ(activityC45651qj, 12.0f);
                    viewGroup2.setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.d7, activityC45651qj));
                    C2055284u.LIZJ(tuxTextView, 62);
                    tuxIconView.setTintColorRes(R.attr.cl);
                    List<DisclaimerText> textList = disclaimer.getTextList();
                    if (textList != null) {
                        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (DisclaimerText disclaimerText : textList) {
                            String text = disclaimerText.getText();
                            if (disclaimerText.getType() == 0) {
                                spannableStringBuilder.append((CharSequence) text);
                            } else if (disclaimerText.getType() == 1) {
                                final ACListenerS29S0300000_3 aCListenerS29S0300000_3 = new ACListenerS29S0300000_3(activityC45651qj, aweme, disclaimerText, 6);
                                final Context context = viewGroup2.getContext();
                                o.LJIIIIZZ(context, "warnLayout.context");
                                ClickableSpan clickableSpan = new ClickableSpan(context, aCListenerS29S0300000_3) { // from class: X.89M
                                    public final View.OnClickListener LJLIL;
                                    public final Context LJLILLLLZI;

                                    @Override // android.text.style.ClickableSpan
                                    public final void onClick(View widget) {
                                        o.LJIIIZ(widget, "widget");
                                        this.LJLIL.onClick(widget);
                                    }

                                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                                    public final void updateDrawState(TextPaint ds) {
                                        o.LJIIIZ(ds, "ds");
                                        ds.setColor(AnonymousClass636.LJIIIIZZ(R.attr.cl, this.LJLILLLLZI));
                                    }

                                    {
                                        this.LJLIL = aCListenerS29S0300000_3;
                                        this.LJLILLLLZI = context;
                                    }
                                };
                                int length = spannableStringBuilder.length();
                                spannableStringBuilder.append((CharSequence) text);
                                spannableStringBuilder.setSpan(clickableSpan, length, text.length() + length, 17);
                            }
                        }
                        C2059186h.LIZ(tuxTextView, spannableStringBuilder);
                        tuxTextView.setOnTouchListener(new View.OnTouchListener() { // from class: X.89H
                            @Override // android.view.View.OnTouchListener
                            public final boolean onTouch(View view, MotionEvent motionEvent) {
                                Integer num;
                                if (motionEvent != null) {
                                    num = Integer.valueOf(motionEvent.getAction());
                                } else {
                                    num = null;
                                }
                                if ((view instanceof TextView) && num != null && (num.intValue() == 1 || num.intValue() == 0)) {
                                    float x = motionEvent.getX();
                                    TextView textView = (TextView) view;
                                    float totalPaddingLeft = (x - textView.getTotalPaddingLeft()) + textView.getScrollX();
                                    float y = (motionEvent.getY() - textView.getTotalPaddingTop()) + textView.getScrollY();
                                    Layout layout = textView.getLayout();
                                    int lineForVertical = layout.getLineForVertical((int) y);
                                    int LLLLLLL = C16880lQ.LLLLLLL(layout, lineForVertical, totalPaddingLeft);
                                    Object[] spans = spannableStringBuilder.getSpans(LLLLLLL, LLLLLLL, ClickableSpan.class);
                                    o.LJIIIIZZ(spans, "spannableString.getSpans…lickableSpan::class.java)");
                                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spans;
                                    if (totalPaddingLeft > textView.getPaint().measureText(textView.getText().subSequence(layout.getLineStart(lineForVertical), layout.getLineEnd(lineForVertical)).toString()) || clickableSpanArr.length == 0) {
                                        Selection.removeSelection(spannableStringBuilder);
                                    } else {
                                        if (num.intValue() == 1) {
                                            clickableSpanArr[0].onClick(tuxTextView);
                                        } else if (num.intValue() == 0) {
                                            SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                                            Selection.setSelection(spannableStringBuilder2, spannableStringBuilder2.getSpanStart(clickableSpanArr[0]), spannableStringBuilder.getSpanEnd(clickableSpanArr[0]));
                                        }
                                        return true;
                                    }
                                }
                                return false;
                            }
                        });
                    }
                }
                tuxTextView.setLayoutParams(layoutParams2);
                tuxIconView.setLayoutParams(layoutParams4);
                return;
            }
            if (C89N.LIZ(aweme)) {
                AwemeCommerceStruct commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo();
                if (commerceVideoAuthInfo == null || commerceVideoAuthInfo.getDarkPostStatus() != 1) {
                    return;
                }
                viewGroup.setVisibility(0);
                ViewGroup viewGroup3 = this.LLFII;
                if (activityC45651qj == null || viewGroup3 == null) {
                    return;
                }
                TuxTextView tuxTextView2 = (TuxTextView) viewGroup3.findViewById(R.id.d6c);
                TuxIconView tuxIconView2 = (TuxIconView) viewGroup3.findViewById(R.id.d6d);
                ViewGroup.LayoutParams layoutParams5 = tuxTextView2.getLayoutParams();
                o.LJII(layoutParams5, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                ViewGroup.LayoutParams layoutParams6 = tuxIconView2.getLayoutParams();
                o.LJII(layoutParams6, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                tuxTextView2.setText(activityC45651qj.getString(R.string.tml));
                tuxTextView2.setTuxFont(62);
                tuxTextView2.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dj, activityC45651qj));
                tuxIconView2.setIconRes(R.raw.icon_horn_ltr);
                tuxIconView2.setTintColorRes(R.attr.cl);
                C2055284u.LIZJ(tuxTextView2, null);
                ((LinearLayout.LayoutParams) layoutParams5).topMargin = (int) KL2.LIZJ(activityC45651qj, 10.0f);
                ((LinearLayout.LayoutParams) layoutParams6).topMargin = (int) KL2.LIZJ(activityC45651qj, 10.0f);
                return;
            }
            ViewGroup viewGroup4 = this.LLFII;
            if (viewGroup4 == null) {
                return;
            }
            viewGroup4.setVisibility(8);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LLFII = (ViewGroup) view.findViewById(R.id.rl);
        C2055284u.LIZJ((TuxTextView) view.findViewById(R.id.d6c), null);
    }
}
