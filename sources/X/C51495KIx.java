package X;

import Y.ARunnableS4S0201000_1;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SugExtraInfo;
import com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity;
import com.ss.android.ugc.aweme.search.pages.sug.core.ui.SugLiveLottieDrawable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS155S0200000_8;
import kotlin.jvm.internal.AqS57S0201000_8;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.KIx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51495KIx {
    public static final void LIZ(TextView textView, SpannableStringBuilder spannableStringBuilder, Drawable drawable, int i) {
        SpannableStringBuilder spannableStringBuilder2;
        o.LJIIIZ(textView, "<this>");
        AqS57S0201000_8 aqS57S0201000_8 = new AqS57S0201000_8(textView, drawable, i, 2);
        if (spannableStringBuilder.length() == 0 || drawable.getBounds().isEmpty()) {
            spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        } else {
            spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            C8FR c8fr = new C8FR(drawable, 2);
            C8FR.LIZJ(c8fr, C90193gN.LIZIZ(textView.getContext()), O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(i))), 0, 4);
            spannableStringBuilder2.append((CharSequence) "  ");
            spannableStringBuilder2.setSpan(c8fr, s.LJJLIIIJ(spannableStringBuilder2) - 1, s.LJJLIIIJ(spannableStringBuilder2), 18);
        }
        if (C16330kX.LIZJ(textView)) {
            textView.setText(spannableStringBuilder2);
            aqS57S0201000_8.invoke(spannableStringBuilder2);
        } else {
            textView.setText(spannableStringBuilder2);
            JVD.LIZIZ(textView, new AqS155S0200000_8(aqS57S0201000_8, spannableStringBuilder2, 23));
        }
    }

    public static final SugLiveLottieDrawable LIZIZ(SearchSugEntity searchSugEntity, TextView mSugView, View itemView, int i) {
        boolean z;
        EnumC51497KIz enumC51497KIz;
        SugLiveLottieDrawable sugLiveLottieDrawable;
        o.LJIIIZ(searchSugEntity, "searchSugEntity");
        o.LJIIIZ(mSugView, "mSugView");
        o.LJIIIZ(itemView, "itemView");
        if (itemView.findViewById(R.id.mlx) != null) {
            itemView.findViewById(R.id.mlx).setVisibility(8);
        }
        if (itemView.findViewById(R.id.mlz) != null) {
            itemView.findViewById(R.id.mlz).setVisibility(8);
        }
        if (itemView.findViewById(R.id.bu7) != null) {
            itemView.findViewById(R.id.bu7).setVisibility(8);
        }
        if (itemView.findViewById(R.id.bst) != null) {
            itemView.findViewById(R.id.bst).setVisibility(0);
        }
        Context context = itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        CharSequence LJIILJJIL = C78841Uwv.LJIILJJIL(searchSugEntity, context, SearchServiceImpl.LLLZI().LLILZ());
        mSugView.setMaxLines(2);
        mSugView.setEllipsize(TextUtils.TruncateAt.END);
        boolean LIZIZ = searchSugEntity.LIZIZ();
        SugExtraInfo sugExtraInfo = searchSugEntity.sugExtraInfo;
        if (sugExtraInfo != null) {
            z = sugExtraInfo.isLiveQuery();
        } else {
            z = false;
        }
        if (z && DYB.LIZ() && (C48966JJq.LIZ(itemView) instanceof SearchResultActivity)) {
            enumC51497KIz = EnumC51497KIz.LIVE;
        } else if (LIZIZ) {
            enumC51497KIz = EnumC51497KIz.HOT;
        } else {
            enumC51497KIz = EnumC51497KIz.NOTHING;
        }
        int i2 = C51496KIy.LIZ[enumC51497KIz.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    mSugView.setText(LJIILJJIL);
                }
            } else {
                sugLiveLottieDrawable = new SugLiveLottieDrawable(mSugView);
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(LJIILJJIL);
                o.LJIIIIZZ(valueOf, "valueOf(searchMatchSpan)");
                LIZ(mSugView, valueOf, sugLiveLottieDrawable, 4);
                mSugView.post(new ARunnableS4S0201000_1(i, mSugView, itemView, 6));
                return sugLiveLottieDrawable;
            }
        } else {
            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(LJIILJJIL);
            o.LJIIIIZZ(valueOf2, "valueOf(searchMatchSpan)");
            Context context2 = mSugView.getContext();
            o.LJIIIIZZ(context2, "mSugView.context");
            Drawable drawable = context2.getResources().getDrawable(R.drawable.c2y);
            o.LJIIIIZZ(drawable, "context.resources.getDra…e.search_suggest_tag_hot)");
            drawable.setBounds(new Rect(0, 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(16))));
            LIZ(mSugView, valueOf2, drawable, 2);
        }
        sugLiveLottieDrawable = null;
        mSugView.post(new ARunnableS4S0201000_1(i, mSugView, itemView, 6));
        return sugLiveLottieDrawable;
    }
}
