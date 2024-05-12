package com.ss.android.ugc.feed.platform.panel.live;

import X.C221108m2;
import X.C62822Ol8;
import X.LZH;
import android.util.LruCache;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LiveInnerPushComponent extends BasePanelComponent {
    public long LJLILLLLZI;
    public boolean LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public LruCache<Integer, Long> LJLJJLL;
    public LZH LJLJL;
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 735));
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 734));
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 733));

    public final void v3() {
        IViewPagerComponentAbility iViewPagerComponentAbility;
        this.LJLILLLLZI = 0L;
        this.LJLJJI = 0;
        LruCache<Integer, Long> lruCache = this.LJLJJLL;
        if (lruCache != null) {
            lruCache.evictAll();
            if (this.LJLJL != null && (iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LJLIL.getValue()) != null) {
                LZH lzh = this.LJLJL;
                if (lzh != null) {
                    iViewPagerComponentAbility.Cp(lzh);
                    return;
                } else {
                    o.LJIJI("changeListener");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("showTimes");
        throw null;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        v3();
    }

    @Override // X.C8W0
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        this.LJLJJLL = new LruCache<>(16);
        this.LJLILLLLZI = 0L;
        this.LJLJL = new LZH(this);
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LJLIL.getValue();
        if (iViewPagerComponentAbility != null) {
            LZH lzh = this.LJLJL;
            if (lzh != null) {
                iViewPagerComponentAbility.De0(lzh);
            } else {
                o.LJIJI("changeListener");
                throw null;
            }
        }
    }
}
