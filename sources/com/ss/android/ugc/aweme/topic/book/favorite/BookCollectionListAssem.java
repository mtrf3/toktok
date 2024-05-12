package com.ss.android.ugc.aweme.topic.book.favorite;

import X.AbstractC72439Sbr;
import X.C16880lQ;
import X.C184087Ki;
import X.C184807Nc;
import X.C184817Nd;
import X.C1DI;
import X.C2068389v;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C42625Go9;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73306Spq;
import X.C78926UyI;
import X.C7MY;
import X.C7PR;
import X.C7RA;
import X.InterfaceC55058LjC;
import X.ORZ;
import X.QD3;
import X.SYL;
import X.W5F;
import X.W5U;
import Y.ACListenerS23S0100000_3;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.detail.prefab.DetailListAssem;
import com.ss.android.ugc.aweme.topic.book.favorite.viewmodel.BookCollectionListViewModel;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes4.dex */
public final class BookCollectionListAssem extends DetailListAssem {
    public final C62822Ol8 LJLLLL;
    public final C214298b3 LJLLLLLL;

    public BookCollectionListAssem() {
        new LinkedHashMap();
        this.LJLLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1064));
        C65776Prg LIZ = C65352Pkq.LIZ(BookCollectionListViewModel.class);
        this.LJLLLLLL = new C214298b3(new AqS153S0100000_3(LIZ, 1065), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C78926UyI.LJIJJ(this), C78926UyI.LJJI(this), C78926UyI.LJJIFFI(this), C184087Ki.INSTANCE, LIZ);
    }

    @Override // com.ss.android.ugc.aweme.prefab.ListAssem
    public final AssemListViewModel P3() {
        return (AssemListViewModel) this.LJLLLLLL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        C42625Go9.LIZIZ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        C42625Go9.LIZJ(this);
    }

    /* loaded from: classes4.dex */
    public static final class BookItemCell extends PowerCell<C184817Nd> {
        @Override // com.bytedance.ies.powerlist.PowerCell
        public final void onBindItemView(C184817Nd c184817Nd) {
            String str;
            List<String> urlList;
            C184817Nd t = c184817Nd;
            o.LJIIIZ(t, "t");
            TopicRawInfo topicRawInfo = t.LJLIL;
            C16880lQ.LJIIJ(new ACListenerS23S0100000_3(topicRawInfo, 161), this.itemView);
            ((TextView) this.itemView.findViewById(R.id.mby)).setText(topicRawInfo.title);
            ((TextView) this.itemView.findViewById(R.id.m04)).setText(topicRawInfo.authorName);
            if (C7RA.LIZIZ) {
                Double LIZIZ = t.LJLIL.LIZIZ();
                if (LIZIZ == null) {
                    this.itemView.findViewById(R.id.inj).setVisibility(8);
                } else {
                    this.itemView.findViewById(R.id.inj).setVisibility(0);
                    ((TextView) this.itemView.findViewById(R.id.inu)).setText(LIZIZ.toString());
                }
            }
            final SmartImageView smartImageView = (SmartImageView) this.itemView.findViewById(R.id.f12);
            smartImageView.setLayoutParams(smartImageView.getLayoutParams());
            UrlModel urlModel = topicRawInfo.cover;
            if (urlModel == null || (urlList = urlModel.getUrlList()) == null || (str = (String) ORZ.LJLLLLLL(0, urlList)) == null) {
                str = "";
            }
            W5F LJIIIIZZ = W5U.LJIIIIZZ(str);
            LJIIIIZZ.LJJIIJ = smartImageView;
            LJIIIIZZ.LIZLLL(new AbstractC72439Sbr() { // from class: X.7KH
                @Override // X.InterfaceC70769Rq1
                public final void s2(android.net.Uri uri, View view, Throwable th) {
                }

                @Override // X.InterfaceC70769Rq1
                public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
                    int i;
                    int LIZIZ2;
                    Number valueOf;
                    int i2 = 90;
                    if (c2047581v != null) {
                        i2 = c2047581v.LIZIZ;
                    }
                    if (c2047581v != null) {
                        i = c2047581v.LIZ;
                    } else {
                        i = 64;
                    }
                    float f = i2 / i;
                    double d = f;
                    if (d > 1.7d) {
                        LIZIZ2 = C7MY.LIZIZ(50);
                    } else if (d >= 1.4d) {
                        LIZIZ2 = C7MY.LIZIZ(54);
                    } else if (d >= 1.2d) {
                        LIZIZ2 = C7MY.LIZIZ(58);
                    } else {
                        LIZIZ2 = C7MY.LIZIZ(64);
                    }
                    float f2 = LIZIZ2 * f;
                    if (f2 > O6R.LJJIIZ(C32151Nz.LJIIZILJ(90))) {
                        valueOf = C1FJ.LIZIZ(90);
                    } else {
                        valueOf = Float.valueOf(f2);
                    }
                    ViewGroup.LayoutParams layoutParams = SmartImageView.this.getLayoutParams();
                    layoutParams.width = LIZIZ2;
                    layoutParams.height = valueOf.intValue();
                    SmartImageView.this.setLayoutParams(layoutParams);
                }
            });
        }

        @Override // com.bytedance.ies.powerlist.PowerCell
        public final View onCreateItemView(ViewGroup viewGroup) {
            return C1DI.LIZ(viewGroup, "parent", R.layout.csm, viewGroup, false, "from(parent.context)\n   …ok_layout, parent, false)");
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onCollectedStatusChange(C184807Nc e) {
        o.LJIIIZ(e, "e");
        TopicRawInfo topicRawInfo = e.LJLIL;
        if (topicRawInfo != null) {
            Integer num = topicRawInfo.type;
            int type = C7PR.BOOK.getType();
            if (num == null || num.intValue() != type) {
                return;
            }
            C184817Nd c184817Nd = new C184817Nd(topicRawInfo, null, null, null, null, 30);
            if (e.LJLILLLLZI) {
                if (M3().getState().LJIIIIZZ() == 0) {
                    O3().setVisibility(8);
                    M3().setVisibility(0);
                }
                M3().getState().LIZIZ(0, c184817Nd);
                M3().LJLI(0);
                return;
            }
            M3().getState().LJIIL(c184817Nd);
            O3().setStatus(L3());
            if (M3().getState().LJIIIIZZ() != 0) {
                return;
            }
            O3().setVisibility(0);
            M3().setVisibility(8);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.DetailListAssem, com.ss.android.ugc.aweme.prefab.ListAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        M3().LLLF.LJZL(BookItemCell.class);
        SYL M3 = M3();
        getContext();
        M3.setLayoutManager(new LinearLayoutManager(1, false));
        M3().setLifecycleOwner(this);
        M3().LJLL();
        if (!((Boolean) this.LJLLLL.getValue()).booleanValue()) {
            O3().setTopMargin(C7MY.LIZIZ(187));
            O3().setButtonTopMargin(C7MY.LIZIZ(193));
        } else {
            O3().setTopMargin(C7MY.LIZIZ(52));
            O3().setButtonTopMargin(C7MY.LIZIZ(20));
        }
        C73306Spq L3 = L3();
        Object obj = getConfig().LJ.get("status_title");
        String str2 = "";
        if (obj == null) {
            str = "";
        } else {
            str = (String) obj;
        }
        L3.getClass();
        L3.LJFF = str;
        Object obj2 = getConfig().LJ.get("status_message");
        if (obj2 != null) {
            str2 = (String) obj2;
        }
        L3.LJI = str2;
        if (!((Boolean) this.LJLLLL.getValue()).booleanValue()) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_map_pin;
            c2068389v.LJ = Integer.valueOf(R.attr.gp);
            L3.LIZ(c2068389v);
        }
        if (!(getContext() instanceof InterfaceC55058LjC)) {
            C2068389v c2068389v2 = new C2068389v();
            c2068389v2.LIZ = R.raw.icon_large_bookmark;
            c2068389v2.LJ = Integer.valueOf(R.attr.gp);
            L3.LIZ(c2068389v2);
        }
        R3();
    }
}
