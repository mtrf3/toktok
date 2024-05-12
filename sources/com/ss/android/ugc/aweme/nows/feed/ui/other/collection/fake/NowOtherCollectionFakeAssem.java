package com.ss.android.ugc.aweme.nows.feed.ui.other.collection.fake;

import X.C17N;
import X.C7MY;
import X.C8XO;
import X.InterfaceC194547kI;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowOtherCollectionFakeAssem extends ReusedUIContentAssem<NowOtherCollectionFakeAssem> implements C8XO<InterfaceC194547kI> {
    public View LJZL;
    public SmartImageView LL;

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public NowOtherCollectionFakeAssem() {
        new LinkedHashMap();
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(InterfaceC194547kI interfaceC194547kI) {
        InterfaceC194547kI item = interfaceC194547kI;
        o.LJIIIZ(item, "item");
        if (item.G()) {
            SmartImageView smartImageView = this.LL;
            if (smartImageView != null) {
                C17N.LJJLIIIJJI(smartImageView);
                View view = this.LJZL;
                if (view != null) {
                    view.setVisibility(4);
                    return;
                } else {
                    o.LJIJI("mainPost");
                    throw null;
                }
            }
            o.LJIJI("fakeWindow");
            throw null;
        }
        View view2 = this.LJZL;
        if (view2 != null) {
            C17N.LJJLIIIJJI(view2);
            SmartImageView smartImageView2 = this.LL;
            if (smartImageView2 != null) {
                C17N.LJJIIJZLJL(smartImageView2);
                return;
            } else {
                o.LJIJI("fakeWindow");
                throw null;
            }
        }
        o.LJIJI("mainPost");
        throw null;
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(InterfaceC194547kI interfaceC194547kI) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LL = (SmartImageView) C7MY.LIZLLL(view, "view", R.id.d4_, "view.findViewById(R.id.fake_window)");
        View findViewById = view.findViewById(R.id.gch);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.main_post)");
        this.LJZL = findViewById;
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(InterfaceC194547kI interfaceC194547kI) {
    }
}
