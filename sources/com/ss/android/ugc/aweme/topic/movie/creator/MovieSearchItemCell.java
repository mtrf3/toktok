package com.ss.android.ugc.aweme.topic.movie.creator;

import X.AbstractC13940gg;
import X.C13930gf;
import X.C141335gf;
import X.C16880lQ;
import X.C184817Nd;
import X.C19N;
import X.C1DI;
import X.C212428Vi;
import X.C3C5;
import X.C55096Ljo;
import X.C55230Lly;
import X.C71897SJp;
import X.C76800UCe;
import X.C7KI;
import X.C90193gN;
import X.ORZ;
import X.W5F;
import X.W5U;
import Y.ACListenerS23S0100000_3;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.topic.common.creator.TopicSearchListAssem;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import com.ss.android.ugc.aweme.topic.movie.creator.MovieSearchItemCell;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class MovieSearchItemCell extends PowerCell<C184817Nd> {
    public TopicSearchListAssem.TopicSelectedAbility LJLIL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        LifecycleOwner currentLifecycleOwner = getCurrentLifecycleOwner();
        if (currentLifecycleOwner != null) {
            Fragment LIZLLL = C212428Vi.LIZLLL(currentLifecycleOwner);
            TopicSearchListAssem.TopicSelectedAbility topicSelectedAbility = null;
            if (LIZLLL != null) {
                topicSelectedAbility = (TopicSearchListAssem.TopicSelectedAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(LIZLLL, null), TopicSearchListAssem.TopicSelectedAbility.class, null);
            }
            this.LJLIL = topicSelectedAbility;
        }
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C13930gf.LIZ(itemView, new AbstractC13940gg(this) { // from class: X.7KM
            public InterfaceC65784Pro<String> LJ;
            public final float LJFF = 0.001f;
            public final C7KL LJI;

            @Override // X.AbstractC13940gg
            public final boolean LJI() {
                return false;
            }

            @Override // X.AbstractC13940gg
            public final InterfaceC65784Pro<String> LIZJ() {
                return this.LJ;
            }

            @Override // X.AbstractC13940gg
            public final InterfaceC19530ph LJ() {
                return this.LJI;
            }

            @Override // X.AbstractC13940gg
            public final float LJIIIZ() {
                return this.LJFF;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [X.7KL] */
            {
                this.LJ = new AqS153S0100000_3(this, 1071);
                this.LJI = new InterfaceC19530ph() { // from class: X.7KL
                    @Override // X.InterfaceC19530ph
                    public final void LIZ(View view, String itemID) {
                        java.util.Map<String, String> map;
                        C188727au c188727au;
                        o.LJIIIZ(itemID, "itemID");
                        C184817Nd item = MovieSearchItemCell.this.getItem();
                        if (item != null && o.LJ(item.LJLJJI, Boolean.FALSE)) {
                            C184817Nd item2 = MovieSearchItemCell.this.getItem();
                            if (item2 != null && (c188727au = item2.LJLJI) != null) {
                                map = c188727au.LIZ;
                            } else {
                                map = null;
                            }
                            FMX.LJIIL("trending_words_show", map);
                        }
                    }
                };
            }

            @Override // X.AbstractC13940gg
            public final void LJIIJJI(InterfaceC65784Pro<String> interfaceC65784Pro) {
                this.LJ = interfaceC65784Pro;
            }
        });
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C184817Nd c184817Nd) {
        SpannableString spannableString;
        int i;
        String str;
        Double d;
        Integer num;
        Double d2;
        boolean z;
        List<String> urlList;
        String str2;
        Double d3;
        Integer num2;
        Double d4;
        int i2;
        final C184817Nd t = c184817Nd;
        o.LJIIIZ(t, "t");
        final TopicRawInfo topicRawInfo = t.LJLIL;
        View view = this.itemView;
        int i3 = R.id.title;
        TextView textView = (TextView) view.findViewById(R.id.title);
        String str3 = topicRawInfo.title;
        if (str3 != null) {
            spannableString = new SpannableString(str3);
            List<Position> list = t.LJLILLLLZI;
            if (list != null) {
                for (Position position : list) {
                    try {
                        spannableString.setSpan(new StyleSpan(1), position.getBegin(), position.getEnd() + 1, 18);
                        C3C5.m7constructorimpl(C76800UCe.LIZ);
                    } catch (Throwable th) {
                        C3C5.m7constructorimpl(C141335gf.LIZ(th));
                    }
                    LifecycleOwner currentLifecycleOwner = getCurrentLifecycleOwner();
                    if (currentLifecycleOwner != null) {
                        if (C212428Vi.LIZ(currentLifecycleOwner) != null) {
                            Integer LIZIZ = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.go);
                            if (LIZIZ != null) {
                                i2 = LIZIZ.intValue();
                            } else {
                                i2 = 0;
                            }
                            try {
                                spannableString.setSpan(new ForegroundColorSpan(i2), position.getBegin(), position.getEnd() + 1, 18);
                                C3C5.m7constructorimpl(C76800UCe.LIZ);
                            } catch (Throwable th2) {
                                C3C5.m7constructorimpl(C141335gf.LIZ(th2));
                            }
                        }
                        View findViewById = this.itemView.findViewById(i3);
                        if (C90193gN.LIZIZ(this.itemView.getContext())) {
                            i = 4;
                        } else {
                            i = 3;
                        }
                        findViewById.setTextDirection(i);
                        TextView textView2 = (TextView) this.itemView.findViewById(R.id.krt);
                        String str4 = "";
                        if (!C90193gN.LIZ() || (d3 = topicRawInfo.externalRating) == null || d3.doubleValue() == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX || (num2 = topicRawInfo.year) == null || num2.intValue() == 0) {
                            Double d5 = topicRawInfo.externalRating;
                            if (d5 == null || d5.doubleValue() == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX || (num = topicRawInfo.year) == null || num.intValue() == 0) {
                                Double d6 = topicRawInfo.externalRating;
                                if (d6 == null || d6.doubleValue() == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                                    Integer num3 = topicRawInfo.year;
                                    if (num3 == null || num3.intValue() == 0) {
                                        str = "";
                                    } else {
                                        str = String.valueOf(topicRawInfo.year);
                                    }
                                } else {
                                    StringBuilder sb = new StringBuilder("IMDb ");
                                    if (topicRawInfo.externalRating != null) {
                                        d = Double.valueOf(((int) (r0.doubleValue() * 10)) / 10.0d);
                                    } else {
                                        d = null;
                                    }
                                    sb.append(d);
                                    str = sb.toString();
                                }
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(topicRawInfo.year);
                                sb2.append(" · IMDb ");
                                if (topicRawInfo.externalRating != null) {
                                    d2 = Double.valueOf(((int) (10 * r0.doubleValue())) / 10.0d);
                                } else {
                                    d2 = null;
                                }
                                sb2.append(d2);
                                str = sb2.toString();
                            }
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            if (topicRawInfo.externalRating != null) {
                                d4 = Double.valueOf(((int) (10 * r0.doubleValue())) / 10.0d);
                            } else {
                                d4 = null;
                            }
                            sb3.append(d4);
                            sb3.append(" IMDb · ");
                            sb3.append(topicRawInfo.year);
                            str = sb3.toString();
                        }
                        textView2.setText(str);
                        C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 295), this.itemView);
                        final C71897SJp c71897SJp = (C71897SJp) this.itemView.findViewById(R.id.jl5);
                        c71897SJp.setOnCheckedChangeListener(null);
                        TopicSearchListAssem.TopicSelectedAbility topicSelectedAbility = this.LJLIL;
                        if (topicSelectedAbility != null) {
                            String str5 = topicRawInfo.id;
                            if (str5 == null) {
                                str5 = "";
                            }
                            z = topicSelectedAbility.z30(str5);
                        } else {
                            z = false;
                        }
                        c71897SJp.setChecked(z);
                        c71897SJp.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: X.7KK
                            @Override // android.widget.CompoundButton.OnCheckedChangeListener
                            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                                java.util.Map<String, String> map;
                                if (o.LJ(C184817Nd.this.LJLJJI, Boolean.TRUE)) {
                                    C188727au c188727au = new C188727au();
                                    TopicRawInfo topicRawInfo2 = topicRawInfo;
                                    c188727au.LJI("movie_id", topicRawInfo2.id);
                                    c188727au.LJI("movie_title", topicRawInfo2.title);
                                    FMX.LJIIL("movie_trending_list_click", c188727au.LIZ);
                                } else {
                                    C188727au c188727au2 = C184817Nd.this.LJLJI;
                                    if (c188727au2 != null) {
                                        map = c188727au2.LIZ;
                                    } else {
                                        map = null;
                                    }
                                    FMX.LJIIL("trending_words_click", map);
                                }
                                C71897SJp c71897SJp2 = c71897SJp;
                                TopicSearchListAssem.TopicSelectedAbility topicSelectedAbility2 = this.LJLIL;
                                if (topicSelectedAbility2 != null) {
                                    z2 = topicSelectedAbility2.Uk(topicRawInfo, z2);
                                }
                                c71897SJp2.setChecked(z2);
                            }
                        });
                        UrlModel urlModel = topicRawInfo.cover;
                        if (urlModel != null && (urlList = urlModel.getUrlList()) != null && (str2 = (String) ORZ.LJLLLLLL(0, urlList)) != null) {
                            str4 = str2;
                        }
                        W5F LJIIIIZZ = W5U.LJIIIIZZ(str4);
                        LJIIIIZZ.LJJIIJ = (SmartImageView) this.itemView.findViewById(R.id.cover);
                        SmartImageView smartImageView = (SmartImageView) this.itemView.findViewById(R.id.cover);
                        o.LJIIIIZZ(smartImageView, "itemView.cover");
                        LJIIIIZZ.LIZLLL(new C7KI(smartImageView));
                    }
                    i3 = R.id.title;
                }
            }
        } else {
            spannableString = null;
        }
        textView.setText(spannableString);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.csk, viewGroup, false, "from(parent.context)\n   …info_item, parent, false)");
    }
}
