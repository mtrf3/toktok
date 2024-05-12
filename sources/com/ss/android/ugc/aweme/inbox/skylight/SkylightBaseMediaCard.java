package com.ss.android.ugc.aweme.inbox.skylight;

import X.C119864n8;
import X.C17N;
import X.C42163Ggh;
import X.C71799SFv;
import X.EnumC48702J9m;
import X.InterfaceC57784Mm4;
import X.JI5;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public abstract class SkylightBaseMediaCard<ITEM extends InterfaceC57784Mm4> extends PowerCell<ITEM> {
    public C71799SFv LJLIL;
    public C119864n8 LJLILLLLZI;
    public TuxTextView LJLJI;
    public SmartImageView LJLJJI;
    public FrameLayout LJLJJL;
    public View LJLJJLL;

    public abstract void L(ITEM item);

    public void Q() {
    }

    public void T() {
    }

    public void U() {
    }

    public void V() {
    }

    public void X() {
    }

    public void Y() {
    }

    public abstract void a0(EnumC48702J9m enumC48702J9m, Map<String, Object> map);

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.sa;
    }

    public final C119864n8 M() {
        C119864n8 c119864n8 = this.LJLILLLLZI;
        if (c119864n8 != null) {
            return c119864n8;
        }
        o.LJIJI("avatarCircle");
        throw null;
    }

    public final C71799SFv N() {
        C71799SFv c71799SFv = this.LJLIL;
        if (c71799SFv != null) {
            return c71799SFv;
        }
        o.LJIJI("avatarView");
        throw null;
    }

    public final SmartImageView P() {
        SmartImageView smartImageView = this.LJLJJI;
        if (smartImageView != null) {
            return smartImageView;
        }
        o.LJIJI("cover");
        throw null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void onItemViewCreated() {
        super.onItemViewCreated();
        View findViewById = this.itemView.findViewById(R.id.acf);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.avatar_iv)");
        this.LJLIL = (C71799SFv) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.abs);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.avatar_circle)");
        this.LJLILLLLZI = (C119864n8) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.gw7);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.name_tv)");
        this.LJLJI = (TuxTextView) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.cover);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.cover)");
        this.LJLJJI = (SmartImageView) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.gc_);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.main_container)");
        this.LJLJJL = (FrameLayout) findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.aqh);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.bottom_mask)");
        this.LJLJJLL = findViewById6;
        N().setOnLongClickListener(JI5.LJLIL);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        a0(EnumC48702J9m.SHOW, new LinkedHashMap());
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void unBind() {
        super.unBind();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(ITEM t) {
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        FrameLayout frameLayout = this.LJLJJL;
        if (frameLayout != null) {
            frameLayout.setOutlineProvider(new C42163Ggh(C17N.LJIILL(8.0d)));
            frameLayout.setClipToOutline(true);
            View view = this.LJLJJLL;
            if (view != null) {
                view.setOutlineProvider(new C42163Ggh(C17N.LJIILL(8.0d)));
                view.setClipToOutline(true);
                L(t);
                return;
            }
            o.LJIJI("bottomMask");
            throw null;
        }
        o.LJIJI("mainContainer");
        throw null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated(Object obj) {
        super.onItemViewCreated(obj);
    }
}
