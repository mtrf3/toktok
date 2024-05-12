package com.ss.android.ugc.aweme.commercialize.widget;

import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C16880lQ;
import X.C171556oJ;
import X.C17N;
import X.C187807Yq;
import X.C201567vc;
import X.C201577vd;
import X.C2065688u;
import X.C2065988x;
import X.C221108m2;
import X.C227088vg;
import X.C36922EeM;
import X.C42398GkU;
import X.C59672NbQ;
import X.C62822Ol8;
import X.C8F5;
import X.C90193gN;
import X.InterfaceC203977zV;
import X.KL2;
import X.ViewOnClickListenerC13880ga;
import Y.ACListenerS23S0100000_3;
import Y.IDCSpanS29S0100000_3;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.ss.android.ugc.aweme.commercialize.model.FakeAuthor;
import com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class AdFakeUserProfileVideoNewDescWidget extends AbsAdProfileWidget {
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 166));
    public C201567vc LJLLILLLL;
    public View LJLLJ;
    public TextView LJLLL;
    public C227088vg LJLLLL;

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final int LJIJ() {
        AwemeRawAd awemeRawAd;
        FakeAuthor fakeAuthor;
        String totalRatingsReviews;
        AwemeRawAd awemeRawAd2;
        FakeAuthor fakeAuthor2;
        String rankLabel;
        AwemeRawAd awemeRawAd3;
        FakeAuthor fakeAuthor3;
        String categoryLabel;
        AwemeRawAd awemeRawAd4;
        FakeAuthor fakeAuthor4;
        Aweme aweme = this.LJLJLJ;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (fakeAuthor = awemeRawAd.getFakeAuthor()) == null || (totalRatingsReviews = fakeAuthor.getTotalRatingsReviews()) == null || totalRatingsReviews.length() == 0) {
            return 3;
        }
        Aweme aweme2 = this.LJLJLJ;
        if (aweme2 != null && (awemeRawAd4 = aweme2.getAwemeRawAd()) != null && (fakeAuthor4 = awemeRawAd4.getFakeAuthor()) != null && fakeAuthor4.getRating() != null) {
            return 1;
        }
        Aweme aweme3 = this.LJLJLJ;
        if (aweme3 == null || (awemeRawAd3 = aweme3.getAwemeRawAd()) == null || (fakeAuthor3 = awemeRawAd3.getFakeAuthor()) == null || (categoryLabel = fakeAuthor3.getCategoryLabel()) == null || categoryLabel.length() == 0) {
            Aweme aweme4 = this.LJLJLJ;
            if (aweme4 == null || (awemeRawAd2 = aweme4.getAwemeRawAd()) == null || (fakeAuthor2 = awemeRawAd2.getFakeAuthor()) == null || (rankLabel = fakeAuthor2.getRankLabel()) == null || rankLabel.length() == 0) {
                return 3;
            }
            return 2;
        }
        return 2;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    public final void LJIILJJIL(C59672NbQ c59672NbQ) {
        String desc;
        boolean z;
        SpannableString spannableString;
        AwemeRawAd awemeRawAd;
        String buttonText;
        List<TextExtraStruct> textExtra;
        int i;
        AwemeRawAd awemeRawAd2;
        String buttonText2;
        String str;
        AwemeRawAd awemeRawAd3;
        FakeAuthor fakeAuthor;
        ViewStub viewStub;
        AwemeRawAd awemeRawAd4;
        ActivityC45651qj mo49getActivity;
        String str2;
        AwemeRawAd awemeRawAd5;
        FakeAuthor fakeAuthor2;
        ViewStub viewStub2;
        Float f;
        AwemeRawAd awemeRawAd6;
        FakeAuthor fakeAuthor3;
        float f2;
        AwemeRawAd awemeRawAd7;
        FakeAuthor fakeAuthor4;
        Float rating;
        float f3;
        float f4;
        ActivityC45651qj mo49getActivity2;
        super.LJIILJJIL(c59672NbQ);
        if (LJIJ() == 1) {
            TextView textView = (TextView) this.LJLLI.getValue();
            if (textView != null) {
                Aweme aweme = this.LJLJLJ;
                if (aweme != null && (awemeRawAd5 = aweme.getAwemeRawAd()) != null && (fakeAuthor2 = awemeRawAd5.getFakeAuthor()) != null) {
                    str2 = fakeAuthor2.getTotalRatingsReviews();
                } else {
                    str2 = null;
                }
                textView.setText(str2);
            }
            Fragment fragment = this.LJLJLLL;
            if (fragment != null && (mo49getActivity2 = fragment.mo49getActivity()) != null) {
                viewStub2 = (ViewStub) mo49getActivity2.findViewById(R.id.km0);
            } else {
                viewStub2 = null;
            }
            if (this.LJLLJ == null && viewStub2 != null) {
                View inflate = viewStub2.inflate();
                this.LJLLL = (TextView) inflate.findViewById(R.id.tw);
                this.LJLLLL = (C227088vg) inflate.findViewById(R.id.tt);
                this.LJLLJ = inflate;
            }
            TextView textView2 = this.LJLLL;
            if (textView2 != null) {
                Aweme aweme2 = this.LJLJLJ;
                if (aweme2 != null && (awemeRawAd6 = aweme2.getAwemeRawAd()) != null && (fakeAuthor3 = awemeRawAd6.getFakeAuthor()) != null) {
                    f = fakeAuthor3.getRating();
                } else {
                    f = null;
                }
                textView2.setText(String.valueOf(f));
            }
            C227088vg c227088vg = this.LJLLLL;
            if (c227088vg != null) {
                Aweme aweme3 = this.LJLJLJ;
                if (aweme3 == null || (awemeRawAd7 = aweme3.getAwemeRawAd()) == null || (fakeAuthor4 = awemeRawAd7.getFakeAuthor()) == null || (rating = fakeAuthor4.getRating()) == null) {
                    f2 = 0.0f;
                } else {
                    int floatValue = ((int) (rating.floatValue() * 10.0f)) / 10;
                    int floatValue2 = ((int) (rating.floatValue() * 10.0f)) % 10;
                    if (floatValue2 == 0) {
                        f2 = floatValue;
                    } else {
                        if (1 <= floatValue2 && floatValue2 < 5) {
                            f3 = floatValue;
                            f4 = 0.25f;
                        } else {
                            f3 = floatValue;
                            if (floatValue2 == 5) {
                                f4 = 0.5f;
                            } else {
                                f4 = 0.75f;
                            }
                        }
                        f2 = f3 + f4;
                    }
                }
                c227088vg.setRatingProgress(f2);
            }
            C227088vg c227088vg2 = this.LJLLLL;
            if (c227088vg2 == null) {
                return;
            }
            c227088vg2.setVisibility(0);
            return;
        }
        if (LJIJ() == 2) {
            TextView textView3 = (TextView) this.LJLLI.getValue();
            if (textView3 != null) {
                Aweme aweme4 = this.LJLJLJ;
                if (aweme4 != null && (awemeRawAd3 = aweme4.getAwemeRawAd()) != null && (fakeAuthor = awemeRawAd3.getFakeAuthor()) != null) {
                    str = fakeAuthor.getTotalRatingsReviews();
                } else {
                    str = null;
                }
                textView3.setText(str);
            }
            Fragment fragment2 = this.LJLJLLL;
            if (fragment2 != null && (mo49getActivity = fragment2.mo49getActivity()) != null) {
                viewStub = (ViewStub) mo49getActivity.findViewById(R.id.km1);
            } else {
                viewStub = null;
            }
            if (this.LJLLILLLL == null && viewStub != null) {
                viewStub.setLayoutResource(R.layout.aus);
                View inflate2 = viewStub.inflate();
                o.LJII(inflate2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.views.FakeUserAdTagView");
                this.LJLLILLLL = (C201567vc) inflate2;
            }
            C201567vc c201567vc = this.LJLLILLLL;
            if (c201567vc != null) {
                Aweme aweme5 = this.LJLJLJ;
                if (aweme5 != null) {
                    awemeRawAd4 = aweme5.getAwemeRawAd();
                } else {
                    awemeRawAd4 = null;
                }
                c201567vc.LIZ(awemeRawAd4);
            }
            C201567vc c201567vc2 = this.LJLLILLLL;
            if (c201567vc2 == null) {
                return;
            }
            c201567vc2.setOnClickListener(new ViewOnClickListenerC13880ga(new View.OnClickListener() { // from class: X.7vb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                }
            }));
            return;
        }
        Aweme aweme6 = this.LJLJLJ;
        if (aweme6 == null || (desc = aweme6.getDesc()) == null) {
            return;
        }
        C201577vd c201577vd = (C201577vd) this.LJLLI.getValue();
        if (c201577vd != null) {
            Aweme aweme7 = this.LJLJLJ;
            if (aweme7 == null || (awemeRawAd2 = aweme7.getAwemeRawAd()) == null || (buttonText2 = awemeRawAd2.getButtonText()) == null || buttonText2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                c201577vd.setText(desc);
            } else {
                Aweme aweme8 = this.LJLJLJ;
                if (aweme8 == null || (awemeRawAd = aweme8.getAwemeRawAd()) == null || (buttonText = awemeRawAd.getButtonText()) == null) {
                    spannableString = null;
                } else {
                    String LIZIZ = C42398GkU.LIZIZ(desc, ' ');
                    spannableString = new SpannableString(i0.LJFF(LIZIZ, buttonText));
                    Context mContext = this.LJLIL;
                    o.LJIIIIZZ(mContext, "mContext");
                    C171556oJ c171556oJ = new C171556oJ(mContext, buttonText, "#80161823", R.drawable.atm, "#0F161823", "#0F161823", 12, 15);
                    spannableString.setSpan(new IDCSpanS29S0100000_3(this, 3), LIZIZ.length(), LIZIZ.length() + buttonText.length(), 18);
                    spannableString.setSpan(c171556oJ, LIZIZ.length(), LIZIZ.length() + buttonText.length(), 18);
                }
                c201577vd.setText(spannableString);
            }
            Context context = this.LJLIL;
            if (context == null) {
                return;
            }
            try {
                if (C90193gN.LIZIZ(context)) {
                    if (C2065688u.LIZ == null) {
                        C2065688u.LIZ = new C2065688u();
                    }
                    c201577vd.setMovementMethod(C2065688u.LIZ);
                } else {
                    c201577vd.setMovementMethod(C2065988x.LIZ());
                }
            } catch (IndexOutOfBoundsException e) {
                C36922EeM.LIZ(e);
            }
            Aweme aweme9 = this.LJLJLJ;
            if (aweme9 != null && (textExtra = aweme9.getTextExtra()) != null) {
                for (TextExtraStruct textExtraStruct : textExtra) {
                    if (textExtraStruct != null) {
                        if (textExtraStruct.getStart() < 0) {
                            textExtraStruct.setStart(0);
                        }
                        if (textExtraStruct.getEnd() > desc.length()) {
                            textExtraStruct.setEnd(desc.length());
                        }
                    }
                }
                Aweme aweme10 = this.LJLJLJ;
                if (aweme10 != null && aweme10.isAd()) {
                    i = 200;
                } else {
                    i = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
                }
                c201577vd.setMaxSize(i);
                c201577vd.setSpanSize(C17N.LJJJLL(15.0d));
                c201577vd.setSpanColor(c201577vd.getCurrentTextColor());
                c201577vd.setSpanStyle(1);
                c201577vd.setOnSpanClickListener(new InterfaceC203977zV() { // from class: X.7vX
                    /* JADX WARN: Code restructure failed: missing block: B:176:0x0408, code lost:
                    
                        if (r2 == null) goto L174;
                     */
                    @Override // X.InterfaceC203977zV
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZ(com.ss.android.ugc.aweme.model.TextExtraStruct r20) {
                        /*
                            Method dump skipped, instructions count: 1118
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C201517vX.LIZ(com.ss.android.ugc.aweme.model.TextExtraStruct):void");
                    }
                });
                c201577vd.LJJIZ(textExtra, new C187807Yq(), null);
                if (desc.length() > 0) {
                    Iterator<TextExtraStruct> it = textExtra.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        TextExtraStruct textExtraStruct2 = it.next();
                        o.LJIIIIZZ(textExtraStruct2, "textExtraStruct");
                        if (LJIIZILJ(textExtraStruct2, desc) && textExtraStruct2.getType() == 0 && (!TextUtils.isEmpty(textExtraStruct2.getAwemeId()) || 2 == textExtraStruct2.getSubtype())) {
                            Aweme aweme11 = this.LJLJLJ;
                            o.LJI(aweme11);
                            if (aweme11.getDesc().charAt(textExtraStruct2.getStart()) == '@') {
                                Context mContext2 = this.LJLIL;
                                o.LJIIIIZZ(mContext2, "mContext");
                                float LJIIJJI = KL2.LJIIJJI(this.LJLIL) - (this.LJLIL.getResources().getDimension(R.dimen.ajx) + KL2.LIZJ(this.LJLIL, 100.0f));
                                Context mContext3 = this.LJLIL;
                                o.LJIIIIZZ(mContext3, "mContext");
                                C8F5 c8f5 = new C8F5(mContext2, LJIIJJI, AnonymousClass636.LJIIIIZZ(R.attr.dg, mContext3), -1, textExtraStruct2, false, false, false, false, 480);
                                c8f5.LJLLI = KL2.LIZJ(this.LJLIL, 12.0f);
                                c8f5.LJLLILLLL = KL2.LIZJ(this.LJLIL, 2.0f);
                                c8f5.LJLJLLL = KL2.LIZJ(this.LJLIL, 13.0f);
                                c201577vd.LJJIL(textExtraStruct2.getStart(), textExtraStruct2.getEnd(), c8f5);
                                break;
                            }
                        }
                    }
                }
            }
        }
        View view = this.LJLJI;
        if (view == null) {
            return;
        }
        C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 204), view);
    }

    public final boolean LJIIZILJ(TextExtraStruct textExtraStruct, String str) {
        if (str != null && textExtraStruct.getStart() >= 0 && textExtraStruct.getEnd() >= 0 && textExtraStruct.getEnd() <= str.length() && textExtraStruct.getStart() < str.length() && textExtraStruct.getStart() < textExtraStruct.getEnd()) {
            return true;
        }
        return false;
    }
}
