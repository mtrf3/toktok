package com.ss.android.ugc.aweme.ecommerce.base.address.widget;

import X.AbstractC029409q;
import X.C0AX;
import X.C16880lQ;
import X.C19N;
import X.C1FL;
import X.C26508Aam;
import X.C29127Bbv;
import X.C36922EeM;
import X.C78946Uyc;
import X.C78983UzD;
import X.C79062V1e;
import X.C79234V7u;
import X.InterfaceC27363AoZ;
import X.InterfaceC65349Pkn;
import X.ORZ;
import X.ViewOnClickListenerC27362AoY;
import X.X1D;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.abmock.SettingsManager;
import com.zhiliaoapp.musically.R;
import defpackage.s0;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes5.dex */
public class SearchResultAdapter extends AbstractC029409q<ViewOnClickListenerC27362AoY> {
    public final boolean LJLIL;
    public List<SearchResultItemVO> LJLILLLLZI;
    public InterfaceC27363AoZ LJLJI;

    /* loaded from: classes5.dex */
    public static final class SearchResultItemVO {
        public final Integer LIZ;
        public final Integer LIZIZ;
        public final Integer LIZJ;

        @InterfaceC65349Pkn("firstText")
        public final String firstText;

        @InterfaceC65349Pkn("keyWord")
        public final String keyWord;

        @InterfaceC65349Pkn("secondText")
        public final String secondText;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SearchResultItemVO)) {
                return false;
            }
            SearchResultItemVO searchResultItemVO = (SearchResultItemVO) obj;
            return o.LJ(this.keyWord, searchResultItemVO.keyWord) && o.LJ(this.firstText, searchResultItemVO.firstText) && o.LJ(this.secondText, searchResultItemVO.secondText) && o.LJ(this.LIZ, searchResultItemVO.LIZ) && o.LJ(this.LIZIZ, searchResultItemVO.LIZIZ) && o.LJ(this.LIZJ, searchResultItemVO.LIZJ);
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int LJ = C79062V1e.LJ(this.firstText, this.keyWord.hashCode() * 31, 31);
            String str = this.secondText;
            int i = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = (LJ + hashCode) * 31;
            Integer num = this.LIZ;
            if (num == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = num.hashCode();
            }
            int i3 = (i2 + hashCode2) * 31;
            Integer num2 = this.LIZIZ;
            if (num2 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = num2.hashCode();
            }
            int i4 = (i3 + hashCode3) * 31;
            Integer num3 = this.LIZJ;
            if (num3 != null) {
                i = num3.hashCode();
            }
            return i4 + i;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SearchResultItemVO(keyWord=");
            LIZ.append(this.keyWord);
            LIZ.append(", firstText=");
            LIZ.append(this.firstText);
            LIZ.append(", secondText=");
            LIZ.append(this.secondText);
            LIZ.append(", firstColor=");
            LIZ.append(this.LIZ);
            LIZ.append(", secondColor=");
            LIZ.append(this.LIZIZ);
            LIZ.append(", firstHighLightColor=");
            return s0.LIZJ(LIZ, this.LIZJ, ')', LIZ);
        }

        public SearchResultItemVO(String keyWord, String firstText, String str, Integer num, Integer num2, Integer num3) {
            o.LJIIIZ(keyWord, "keyWord");
            o.LJIIIZ(firstText, "firstText");
            this.keyWord = keyWord;
            this.firstText = firstText;
            this.secondText = str;
            this.LIZ = num;
            this.LIZIZ = num2;
            this.LIZJ = num3;
        }

        public /* synthetic */ SearchResultItemVO(String str, String str2, String str3, Integer num, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) == 0 ? num3 : null);
        }
    }

    public int LJLLLLLL() {
        return R.layout.a6x;
    }

    @Override // X.AbstractC029409q
    public final long getItemId(int i) {
        return i;
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        List<SearchResultItemVO> list = this.LJLILLLLZI;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public SearchResultAdapter(boolean z) {
        this.LJLIL = z;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(ViewOnClickListenerC27362AoY viewOnClickListenerC27362AoY, int i) {
        SearchResultItemVO searchResultItemVO;
        ViewOnClickListenerC27362AoY holder = viewOnClickListenerC27362AoY;
        o.LJIIIZ(holder, "holder");
        List<SearchResultItemVO> list = this.LJLILLLLZI;
        ForegroundColorSpan foregroundColorSpan = null;
        if (list != null) {
            searchResultItemVO = (SearchResultItemVO) ORZ.LJLLLLLL(i, list);
        } else {
            searchResultItemVO = null;
        }
        int itemCount = getItemCount();
        boolean z = false;
        if (searchResultItemVO != null) {
            String str = searchResultItemVO.firstText;
            Locale locale = Locale.ROOT;
            String lowerCase = str.toLowerCase(locale);
            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            String lowerCase2 = searchResultItemVO.keyWord.toLowerCase(locale);
            o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            int LJJLIIIJL = s.LJJLIIIJL(lowerCase, lowerCase2, 0, false, 6);
            Integer num = searchResultItemVO.LIZ;
            if (num == null) {
                num = C19N.LIZIZ(holder.itemView, "itemView.context", R.attr.gp);
            }
            if (num != null) {
                ((TextView) holder.itemView.findViewById(R.id.m1k)).setTextColor(num.intValue());
            }
            Integer num2 = searchResultItemVO.LIZIZ;
            if (num2 == null) {
                num2 = C19N.LIZIZ(holder.itemView, "itemView.context", R.attr.go);
            }
            if (num2 != null) {
                ((TextView) holder.itemView.findViewById(R.id.m1l)).setTextColor(num2.intValue());
            }
            if (LJJLIIIJL != -1) {
                SpannableString spannableString = new SpannableString(searchResultItemVO.firstText);
                Integer num3 = searchResultItemVO.LIZJ;
                if (num3 != null || (num3 = C19N.LIZIZ(holder.itemView, "itemView.context", R.attr.go)) != null) {
                    foregroundColorSpan = new ForegroundColorSpan(num3.intValue());
                }
                spannableString.setSpan(foregroundColorSpan, LJJLIIIJL, searchResultItemVO.keyWord.length() + LJJLIIIJL, 33);
                ((TextView) holder.itemView.findViewById(R.id.m1k)).setText(spannableString);
            } else {
                ((TextView) holder.itemView.findViewById(R.id.m1k)).setText(searchResultItemVO.firstText);
            }
            if (searchResultItemVO.secondText == null) {
                View findViewById = holder.itemView.findViewById(R.id.m1l);
                o.LJIIIIZZ(findViewById, "itemView.tv_cand_text_second");
                findViewById.setVisibility(8);
            } else {
                View findViewById2 = holder.itemView.findViewById(R.id.m1l);
                o.LJIIIIZZ(findViewById2, "itemView.tv_cand_text_second");
                findViewById2.setVisibility(0);
                ((TextView) holder.itemView.findViewById(R.id.m1l)).setText(searchResultItemVO.secondText);
            }
        }
        if (holder.LJLIL) {
            View itemView = holder.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            if (holder.getLayoutPosition() != itemCount - 1) {
                z = true;
            }
            C26508Aam.LIZ(itemView, z);
        }
    }

    @Override // X.AbstractC029409q
    public final ViewOnClickListenerC27362AoY onCreateViewHolder(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        ViewOnClickListenerC27362AoY viewOnClickListenerC27362AoY = new ViewOnClickListenerC27362AoY(C1FL.LIZIZ(parent, LJLLLLLL(), parent, false, "createView(parent, getLayout())"), this.LJLIL);
        viewOnClickListenerC27362AoY.LJLILLLLZI = this.LJLJI;
        C0AX.LIZ(parent, viewOnClickListenerC27362AoY.itemView, R.id.lj7);
        View view = viewOnClickListenerC27362AoY.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (viewOnClickListenerC27362AoY.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(ViewOnClickListenerC27362AoY.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) viewOnClickListenerC27362AoY.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(viewOnClickListenerC27362AoY.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = ViewOnClickListenerC27362AoY.class.getName();
        return viewOnClickListenerC27362AoY;
    }
}
