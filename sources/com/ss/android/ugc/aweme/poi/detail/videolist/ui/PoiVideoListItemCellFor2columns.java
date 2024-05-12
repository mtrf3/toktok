package com.ss.android.ugc.aweme.poi.detail.videolist.ui;

import X.C188457aT;
import X.C191747fm;
import X.C191757fn;
import X.C191767fo;
import X.C191807fs;
import X.C191827fu;
import X.C191837fv;
import X.C1DI;
import X.C2068389v;
import X.C214298b3;
import X.C221108m2;
import X.C26338AVi;
import X.C32151Nz;
import X.C50420Jqa;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72434Sbm;
import X.C72704Sg8;
import X.C77123UOp;
import X.C7MY;
import X.C8FR;
import X.C8SG;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.InterfaceC207258Bl;
import X.InterfaceC65784Pro;
import X.InterfaceC93923mO;
import X.JP2;
import X.O6R;
import X.QD3;
import X.YE1;
import Y.ARunnableS39S0100000_3;
import android.content.Context;
import android.graphics.Outline;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes4.dex */
public final class PoiVideoListItemCellFor2columns extends PowerCell<C188457aT> {
    public Boolean LJLIL;
    public SmartImageView LJLILLLLZI;
    public ImageView LJLJI;
    public TuxTextView LJLJJI;
    public TextView LJLJJL;
    public C72434Sbm LJLJJLL;
    public TuxTextView LJLJL;
    public TuxTextView LJLJLJ;
    public TuxTextView LJLJLLL;
    public InterfaceC207258Bl LJLL;
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 743));
    public final C214298b3 LJLLILLLL;

    public PoiVideoListItemCellFor2columns() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(PoiDetailInfoViewModel.class);
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(LIZ, 749);
        C191807fs c191807fs = C191807fs.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS153S0100000_3, C191757fn.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 750), new AqS153S0100000_3((InterfaceC93923mO) this, 751), C191837fv.INSTANCE, c191807fs, new AqS153S0100000_3((InterfaceC93923mO) this, 752), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS153S0100000_3, C191767fo.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 753), new AqS153S0100000_3((InterfaceC93923mO) this, 744), C191827fu.INSTANCE, c191807fs, new AqS153S0100000_3((InterfaceC93923mO) this, 745), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS153S0100000_3, C191747fm.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 746), new AqS153S0100000_3((InterfaceC93923mO) this, 747), new AqS153S0100000_3((InterfaceC93923mO) this, 748), c191807fs, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLLILLLL = c214298b3;
    }

    public final void L() {
        int i;
        Aweme aweme;
        int i2;
        Integer valueOf;
        long j;
        SpannableStringBuilder spannableStringBuilder;
        Aweme aweme2;
        AwemeStatistics statistics;
        Aweme aweme3;
        if (getContext() == null) {
            return;
        }
        C188457aT item = getItem();
        if (item != null && (aweme3 = item.LJLILLLLZI) != null) {
            i = aweme3.getUserDigg();
        } else {
            i = 0;
        }
        C188457aT item2 = getItem();
        if (item2 != null) {
            aweme = item2.LJLILLLLZI;
        } else {
            aweme = null;
        }
        if (JP2.LIZ(aweme)) {
            return;
        }
        C2068389v c2068389v = new C2068389v();
        if (i == 1) {
            i2 = R.raw.icon_like_fill;
        } else {
            i2 = R.raw.icon_like_bold;
        }
        c2068389v.LIZ = i2;
        if (i == 1) {
            valueOf = Integer.valueOf(R.attr.eb);
        } else {
            valueOf = Integer.valueOf(R.attr.gv);
        }
        c2068389v.LJ = valueOf;
        c2068389v.LIZJ = C7MY.LIZIZ(14);
        c2068389v.LIZIZ = C7MY.LIZIZ(14);
        TextView textView = this.LJLJJL;
        if (textView != null) {
            Context context = textView.getContext();
            o.LJIIIIZZ(context, "txtDesc.context");
            C8FR LIZIZ = c2068389v.LIZIZ(2, context);
            C8FR.LIZJ(LIZIZ, C72704Sg8.LIZIZ(this.itemView, "itemView.context"), 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)), 2);
            C188457aT item3 = getItem();
            if (item3 != null && (aweme2 = item3.LJLILLLLZI) != null && (statistics = aweme2.getStatistics()) != null) {
                j = statistics.getDiggCount();
            } else {
                j = 0;
            }
            String LJJIIJ = C77123UOp.LJJIIJ(j);
            o.LJIIIIZZ(LJJIIJ, "getDisplayCount(likeCount)");
            TuxTextView tuxTextView = this.LJLJLJ;
            if (tuxTextView != null) {
                if (C26338AVi.LIZLLL(tuxTextView)) {
                    spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) LJJIIJ);
                    spannableStringBuilder.append((CharSequence) "x");
                    spannableStringBuilder.setSpan(LIZIZ, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
                } else {
                    spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) "x");
                    spannableStringBuilder.setSpan(LIZIZ, 0, 1, 17);
                    spannableStringBuilder.append((CharSequence) LJJIIJ);
                }
                tuxTextView.setText(spannableStringBuilder);
                return;
            }
            o.LJIJI("txtLikeCount");
            throw null;
        }
        o.LJIJI("txtDesc");
        throw null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        ViewGroup viewGroup;
        super.onItemViewCreated();
        this.LJLILLLLZI = (SmartImageView) this.itemView.findViewById(R.id.cover);
        View findViewById = this.itemView.findViewById(R.id.desc);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.desc)");
        this.LJLJJL = (TextView) findViewById;
        this.LJLJJI = (TuxTextView) this.itemView.findViewById(R.id.n5x);
        this.LJLJI = (ImageView) this.itemView.findViewById(R.id.n5v);
        View findViewById2 = this.itemView.findViewById(R.id.aa0);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.author_name)");
        TuxTextView tuxTextView = (TuxTextView) findViewById2;
        this.LJLJL = tuxTextView;
        tuxTextView.setTextDirection(5);
        View findViewById3 = this.itemView.findViewById(R.id.fqv);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.like_and_play_count)");
        this.LJLJLJ = (TuxTextView) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.a_v);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.author_avatar)");
        this.LJLJJLL = (C72434Sbm) findViewById4;
        this.LJLJLLL = (TuxTextView) this.itemView.findViewById(R.id.n5w);
        C8SG c8sg = C8SG.LIZIZ;
        View view = this.itemView;
        if (view instanceof ViewGroup) {
            viewGroup = (ViewGroup) view;
        } else {
            viewGroup = null;
        }
        this.LJLL = c8sg.LJI(viewGroup);
        SmartImageView smartImageView = this.LJLILLLLZI;
        if (smartImageView != null) {
            smartImageView.setOutlineProvider(new ViewOutlineProvider() { // from class: X.7fp
                @Override // android.view.ViewOutlineProvider
                public final void getOutline(View view2, Outline outline) {
                    if (view2 == null || outline == null) {
                        return;
                    }
                    outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), C7MY.LIZIZ(4));
                }
            });
            smartImageView.setClipToOutline(true);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        SmartImageView smartImageView;
        super.onViewAttachedToWindow();
        SmartImageView smartImageView2 = this.LJLILLLLZI;
        if (smartImageView2 != null) {
            smartImageView2.setAttached(true);
        }
        if (o.LJ(this.LJLIL, Boolean.TRUE) && (smartImageView = this.LJLILLLLZI) != null) {
            smartImageView.LJ();
        }
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        SmartImageView smartImageView;
        super.onViewDetachedFromWindow();
        SmartImageView smartImageView2 = this.LJLILLLLZI;
        if (smartImageView2 != null) {
            smartImageView2.setAttached(false);
        }
        if (o.LJ(this.LJLIL, Boolean.TRUE) && (smartImageView = this.LJLILLLLZI) != null) {
            smartImageView.LJFF();
        }
        EventBus.LIZJ().LJIJ(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x01d6  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.C188457aT r19) {
        /*
            Method dump skipped, instructions count: 859
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.videolist.ui.PoiVideoListItemCellFor2columns.onBindItemView(X.Mm4):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.bzz, viewGroup, false, "from(parent.context)\n   …format_v2, parent, false)");
    }

    @QD3
    public final void onVideoEvent(C50420Jqa event) {
        o.LJIIIZ(event, "event");
        this.itemView.post(new ARunnableS39S0100000_3(this, 166));
    }
}
