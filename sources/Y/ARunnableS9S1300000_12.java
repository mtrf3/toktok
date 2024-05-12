package Y;

import X.C72972SkS;
import X.C85316Xe4;
import X.EnumC57435MgR;
import X.T5U;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.poi.search.PoiSearchCellV2;
import com.ss.android.ugc.aweme.relation.fragment.muflist.MufListPageViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class ARunnableS9S1300000_12 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        IMUser iMUser;
        List<IMUser> list = ((MufListPageViewModel) this.l1).LJLJJI;
        String str = this.s0;
        Iterator<IMUser> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                iMUser = it.next();
                if (o.LJ(iMUser.getUid(), str)) {
                    break;
                }
            } else {
                iMUser = null;
                break;
            }
        }
        IMUser iMUser2 = iMUser;
        if (iMUser2 == null) {
            return;
        }
        Integer num = (Integer) this.l2;
        int value = EnumC57435MgR.FOLLOW_MUTUAL.getValue();
        int i = 0;
        if (num == null || num.intValue() != value) {
            i = -1;
        }
        iMUser2.setType(i);
        Integer num2 = (Integer) this.l2;
        if (num2 != null) {
            iMUser2.setFollowStatus(num2.intValue());
        }
        Integer num3 = (Integer) this.l3;
        if (num3 != null) {
            iMUser2.setFollowerStatus(num3.intValue());
        }
    }

    public final void LIZ$1() {
        boolean z;
        SpannableStringBuilder spannableStringBuilder;
        TuxTextView tuxTextView = ((PoiSearchCellV2) this.l2).LJLIL;
        if (tuxTextView != null) {
            if (tuxTextView.getParent() != null) {
                PoiSearchCellV2 poiSearchCellV2 = (PoiSearchCellV2) this.l2;
                TuxTextView tuxTextView2 = poiSearchCellV2.LJLIL;
                if (tuxTextView2 != null) {
                    C85316Xe4 c85316Xe4 = (C85316Xe4) this.l3;
                    Layout layout = tuxTextView2.getLayout();
                    if (layout != null && layout.getEllipsisCount(tuxTextView2.getLineCount() - 1) > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        tuxTextView2.setTuxFont(52);
                        SpannableString spannableString = poiSearchCellV2.LJLJJI;
                        if (spannableString != null) {
                            float width = ((tuxTextView2.getWidth() - tuxTextView2.getPaddingLeft()) - tuxTextView2.getPaddingRight()) - Layout.getDesiredWidth(spannableString, tuxTextView2.getPaint());
                            poiSearchCellV2.N(tuxTextView2, c85316Xe4);
                            CharSequence text = tuxTextView2.getText();
                            o.LJIIIIZZ(text, "text");
                            SpannableString valueOf = SpannableString.valueOf(text);
                            o.LJIIIIZZ(valueOf, "SpannableString.valueOf(this)");
                            spannableStringBuilder = new SpannableStringBuilder(TextUtils.ellipsize(valueOf, tuxTextView2.getPaint(), width, TextUtils.TruncateAt.END));
                        } else {
                            o.LJIJI("dotDividerSpan");
                            throw null;
                        }
                    } else {
                        CharSequence text2 = tuxTextView2.getText();
                        o.LJIIIIZZ(text2, "text");
                        SpannableString valueOf2 = SpannableString.valueOf(text2);
                        o.LJIIIIZZ(valueOf2, "SpannableString.valueOf(this)");
                        spannableStringBuilder = new SpannableStringBuilder(valueOf2);
                    }
                    PoiSearchCellV2 poiSearchCellV22 = (PoiSearchCellV2) this.l2;
                    String str = this.s0;
                    poiSearchCellV22.getClass();
                    SpannableString spannableString2 = poiSearchCellV22.LJLJJI;
                    if (spannableString2 != null) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableString2);
                        SpannableString spannableString3 = new SpannableString(str);
                        TuxTextView tuxTextView3 = poiSearchCellV22.LJLIL;
                        if (tuxTextView3 != null) {
                            int i = R.attr.gx;
                            Integer LIZJ = C72972SkS.LIZJ(tuxTextView3, "tvPoiName.context", R.attr.gx);
                            if (LIZJ != null) {
                                i = LIZJ.intValue();
                            }
                            spannableString3.setSpan(new ForegroundColorSpan(i), 0, str.length(), 17);
                            spannableString3.setSpan(new T5U(51, false), 0, str.length(), 17);
                            spannableStringBuilder2.append((CharSequence) spannableString3);
                            spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                            tuxTextView2.setText(spannableStringBuilder);
                            tuxTextView2.setSingleLine(false);
                            tuxTextView2.setMaxLines(2);
                            tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
                            ((PoiSearchCellV2) this.l2).LJLJLLL = true;
                            return;
                        }
                        o.LJIJI("tvPoiName");
                        throw null;
                    }
                    o.LJIJI("dotDividerSpan");
                    throw null;
                }
                o.LJIJI("tvPoiName");
                throw null;
            }
            ((PoiSearchCellV2) this.l2).LJLJLLL = false;
            return;
        }
        o.LJIJI("tvPoiName");
        throw null;
    }

    public static final void run$0(ARunnableS9S1300000_12 aRunnableS9S1300000_12) {
        boolean LIZ;
        try {
            aRunnableS9S1300000_12.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS9S1300000_12 aRunnableS9S1300000_12) {
        boolean LIZ;
        try {
            aRunnableS9S1300000_12.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS9S1300000_12(Object obj, Object obj2, Object obj3, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.l3 = obj3;
        this.s0 = str;
    }
}
