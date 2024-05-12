package com.ss.android.ugc.aweme.topic.book.creator;

import X.AbstractC13940gg;
import X.AbstractC72439Sbr;
import X.C13930gf;
import X.C16880lQ;
import X.C184007Ka;
import X.C184017Kb;
import X.C184027Kc;
import X.C184817Nd;
import X.C19N;
import X.C1DI;
import X.C212428Vi;
import X.C214298b3;
import X.C55096Ljo;
import X.C55230Lly;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71897SJp;
import X.C7KX;
import X.C7KY;
import X.C7KZ;
import X.C7RA;
import X.C90193gN;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.InterfaceC65784Pro;
import X.InterfaceC93923mO;
import X.ORZ;
import X.W5F;
import X.W5U;
import X.YE1;
import Y.ACListenerS23S0100000_3;
import android.graphics.drawable.Animatable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.topic.book.creator.BookSearchItemCell;
import com.ss.android.ugc.aweme.topic.common.creator.TopicSearchListAssem;
import com.ss.android.ugc.aweme.topic.common.creator.vm.TopicSearchViewModel;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class BookSearchItemCell extends PowerCell<C184817Nd> {
    public TopicSearchListAssem.TopicSelectedAbility LJLIL;
    public final C214298b3 LJLILLLLZI;

    public BookSearchItemCell() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(TopicSearchViewModel.class);
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(LIZ, 1050);
        C184007Ka c184007Ka = C184007Ka.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS153S0100000_3, C7KY.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 1051), new AqS153S0100000_3((InterfaceC93923mO) this, 1052), C184027Kc.INSTANCE, c184007Ka, new AqS153S0100000_3((InterfaceC93923mO) this, 1053), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS153S0100000_3, C7KZ.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 1054), new AqS153S0100000_3((InterfaceC93923mO) this, 1045), C184017Kb.INSTANCE, c184007Ka, new AqS153S0100000_3((InterfaceC93923mO) this, 1046), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS153S0100000_3, C7KX.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 1047), new AqS153S0100000_3((InterfaceC93923mO) this, 1048), new AqS153S0100000_3((InterfaceC93923mO) this, 1049), c184007Ka, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLILLLLZI = c214298b3;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        Fragment LIZLLL;
        super.onItemViewCreated();
        LifecycleOwner currentLifecycleOwner = getCurrentLifecycleOwner();
        TopicSearchListAssem.TopicSelectedAbility topicSelectedAbility = null;
        if (currentLifecycleOwner != null && (LIZLLL = C212428Vi.LIZLLL(currentLifecycleOwner)) != null) {
            topicSelectedAbility = (TopicSearchListAssem.TopicSelectedAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(LIZLLL, null), TopicSearchListAssem.TopicSelectedAbility.class, null);
        }
        this.LJLIL = topicSelectedAbility;
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C13930gf.LIZ(itemView, new AbstractC13940gg(this) { // from class: X.7KW
            public InterfaceC65784Pro<String> LJ;
            public final float LJFF = 0.001f;
            public final C7KV LJI;

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

            /* JADX WARN: Type inference failed for: r0v2, types: [X.7KV] */
            {
                this.LJ = new AqS153S0100000_3(this, 1044);
                this.LJI = new InterfaceC19530ph() { // from class: X.7KV
                    @Override // X.InterfaceC19530ph
                    public final void LIZ(View view, String itemID) {
                        java.util.Map<String, String> map;
                        C188727au c188727au;
                        o.LJIIIZ(itemID, "itemID");
                        C184817Nd item = BookSearchItemCell.this.getItem();
                        if (item != null && o.LJ(item.LJLJJI, Boolean.FALSE)) {
                            C184817Nd item2 = BookSearchItemCell.this.getItem();
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
        boolean z;
        List<String> urlList;
        String str;
        int i2;
        final C184817Nd t = c184817Nd;
        o.LJIIIZ(t, "t");
        final TopicRawInfo topicRawInfo = t.LJLIL;
        TextView textView = (TextView) this.itemView.findViewById(R.id.title);
        String str2 = topicRawInfo.title;
        if (str2 != null) {
            spannableString = new SpannableString(str2);
            List<Position> list = t.LJLILLLLZI;
            if (list != null) {
                for (Position position : list) {
                    spannableString.setSpan(new StyleSpan(1), position.getBegin(), position.getEnd() + 1, 18);
                    LifecycleOwner currentLifecycleOwner = getCurrentLifecycleOwner();
                    if (currentLifecycleOwner != null && C212428Vi.LIZ(currentLifecycleOwner) != null) {
                        Integer LIZIZ = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.go);
                        if (LIZIZ != null) {
                            i2 = LIZIZ.intValue();
                        } else {
                            i2 = 0;
                        }
                        spannableString.setSpan(new ForegroundColorSpan(i2), position.getBegin(), position.getEnd() + 1, 18);
                    }
                }
            }
        } else {
            spannableString = null;
        }
        textView.setText(spannableString);
        View findViewById = this.itemView.findViewById(R.id.title);
        if (C90193gN.LIZIZ(this.itemView.getContext())) {
            i = 4;
        } else {
            i = 3;
        }
        findViewById.setTextDirection(i);
        ((TextView) this.itemView.findViewById(R.id.krt)).setText(topicRawInfo.authorName);
        if (C7RA.LIZIZ) {
            Double LIZIZ2 = t.LJLIL.LIZIZ();
            if (LIZIZ2 != null) {
                this.itemView.findViewById(R.id.inj).setVisibility(0);
                ((TextView) this.itemView.findViewById(R.id.inu)).setText(LIZIZ2.toString());
            } else {
                this.itemView.findViewById(R.id.inj).setVisibility(8);
            }
        }
        C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 185), this.itemView);
        final C71897SJp c71897SJp = (C71897SJp) this.itemView.findViewById(R.id.jl5);
        c71897SJp.setOnCheckedChangeListener(null);
        TopicSearchListAssem.TopicSelectedAbility topicSelectedAbility = this.LJLIL;
        String str3 = "";
        if (topicSelectedAbility != null) {
            String str4 = topicRawInfo.id;
            if (str4 == null) {
                str4 = "";
            }
            z = topicSelectedAbility.z30(str4);
        } else {
            z = false;
        }
        c71897SJp.setChecked(z);
        c71897SJp.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: X.7KU
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                java.util.Map<String, String> map;
                String str5 = ((TopicSearchViewModel) BookSearchItemCell.this.LJLILLLLZI.getValue()).LJLIL;
                if (str5 == null || str5.length() == 0) {
                    C188727au c188727au = new C188727au();
                    TopicRawInfo topicRawInfo2 = topicRawInfo;
                    c188727au.LJI("book_id", topicRawInfo2.id);
                    c188727au.LJI("book_title", topicRawInfo2.title);
                    FMX.LJIIL("book_trending_list_click", c188727au.LIZ);
                } else {
                    C188727au c188727au2 = t.LJLJI;
                    if (c188727au2 != null) {
                        map = c188727au2.LIZ;
                    } else {
                        map = null;
                    }
                    FMX.LJIIL("trending_words_click", map);
                }
                C71897SJp c71897SJp2 = c71897SJp;
                TopicSearchListAssem.TopicSelectedAbility topicSelectedAbility2 = BookSearchItemCell.this.LJLIL;
                if (topicSelectedAbility2 != null) {
                    z2 = topicSelectedAbility2.Uk(topicRawInfo, z2);
                }
                c71897SJp2.setChecked(z2);
            }
        });
        UrlModel urlModel = topicRawInfo.cover;
        if (urlModel != null && (urlList = urlModel.getUrlList()) != null && (str = (String) ORZ.LJLLLLLL(0, urlList)) != null) {
            str3 = str;
        }
        W5F LJIIIIZZ = W5U.LJIIIIZZ(str3);
        LJIIIIZZ.LJJIIJ = (SmartImageView) this.itemView.findViewById(R.id.cover);
        LJIIIIZZ.LIZLLL(new AbstractC72439Sbr() { // from class: X.7KJ
            @Override // X.InterfaceC70769Rq1
            public final void s2(android.net.Uri uri, View view, Throwable th) {
            }

            @Override // X.InterfaceC70769Rq1
            public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
                int i3;
                int LIZIZ3;
                Number valueOf;
                int i4 = 90;
                if (c2047581v != null) {
                    i4 = c2047581v.LIZIZ;
                }
                if (c2047581v != null) {
                    i3 = c2047581v.LIZ;
                } else {
                    i3 = 64;
                }
                float f = i4 / i3;
                double d = f;
                if (d > 1.7d) {
                    LIZIZ3 = C7MY.LIZIZ(50);
                } else if (d >= 1.4d) {
                    LIZIZ3 = C7MY.LIZIZ(54);
                } else if (d >= 1.2d) {
                    LIZIZ3 = C7MY.LIZIZ(58);
                } else {
                    LIZIZ3 = C7MY.LIZIZ(64);
                }
                float f2 = LIZIZ3 * f;
                if (f2 > O6R.LJJIIZ(C32151Nz.LJIIZILJ(90))) {
                    valueOf = C1FJ.LIZIZ(90);
                } else {
                    valueOf = Float.valueOf(f2);
                }
                ViewGroup.LayoutParams layoutParams = BookSearchItemCell.this.itemView.findViewById(R.id.cover).getLayoutParams();
                layoutParams.width = LIZIZ3;
                layoutParams.height = valueOf.intValue();
                BookSearchItemCell.this.itemView.findViewById(R.id.cover).setLayoutParams(layoutParams);
            }
        });
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.csk, viewGroup, false, "from(parent.context)\n   …info_item, parent, false)");
    }
}
