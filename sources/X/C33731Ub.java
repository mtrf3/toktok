package X;

import Y.IDRunnableS85S0100000;
import Y.IDfS292S0100000;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.effect.FilterPanelFetchSuccessChannel;
import com.bytedance.android.live.effect.OnFilterSelectedByClickEvent;
import com.bytedance.android.live.effect.api.OnFilterIndexChangeEvent;
import com.bytedance.android.live.effect.api.OnFilterSelectedEvent;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1Ub, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33731Ub extends AbstractC24260xK {
    public final DataChannel LIZLLL;
    public LifecycleOwner LJ;
    public final List<FilterModel> LJFF;
    public final C43191ml LJI;
    public Integer LJII;

    @Override // X.AbstractC24260xK
    public final void LIZ() {
        C88207Yjb.LIZLLL(this.LIZIZ);
    }

    public final void LIZIZ() {
        DataChannel dataChannel = this.LIZLLL;
        if (dataChannel != null) {
            dataChannel.ov0(this.LJ, FilterPanelFetchSuccessChannel.class, new IDqS416S0100000(this, 248));
        }
        C73943T0h.LIZ().LIZLLL(this.LJ, C11040c0.class, new InterfaceC73592SuS() { // from class: X.1Ua
            @Override // X.InterfaceC73592SuS
            public final boolean test(Object it) {
                o.LJIIIZ(it, "it");
                return true;
            }
        }).LIZIZ(new IDfS292S0100000(this, 31));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33731Ub(ViewGroup parent, DataChannel dataChannel, LifecycleOwner lifecycleOwner) {
        super(parent);
        Collection collection;
        o.LJIIIZ(parent, "parent");
        this.LIZLLL = dataChannel;
        this.LJ = lifecycleOwner;
        ArrayList arrayList = new ArrayList();
        this.LJFF = arrayList;
        C43191ml c43191ml = new C43191ml(parent.getContext(), new InterfaceC15730jZ() { // from class: X.1UZ
            @Override // X.InterfaceC15730jZ
            public final void onItemClick(int i) {
                int i2;
                C33731Ub c33731Ub = C33731Ub.this;
                DataChannel dataChannel2 = c33731Ub.LIZLLL;
                if (dataChannel2 != null) {
                    dataChannel2.qv0(OnFilterSelectedEvent.class, ListProtector.get(c33731Ub.LJFF, i));
                }
                DataChannel dataChannel3 = C33731Ub.this.LIZLLL;
                if (dataChannel3 != null) {
                    dataChannel3.qv0(OnFilterSelectedByClickEvent.class, Boolean.TRUE);
                }
                Integer currentIndex = C33731Ub.this.LJII;
                o.LJIIIIZZ(currentIndex, "currentIndex");
                if (currentIndex.intValue() > i) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
                DataChannel dataChannel4 = C33731Ub.this.LIZLLL;
                if (dataChannel4 != null) {
                    dataChannel4.qv0(OnFilterIndexChangeEvent.class, Integer.valueOf(i2));
                }
                C33731Ub.this.LJII = Integer.valueOf(i);
            }
        });
        this.LJI = c43191ml;
        this.LJII = InterfaceC30442Bx8.LJIJI.LIZJ();
        if (dataChannel == null || (collection = (Collection) dataChannel.kv0(FilterPanelFetchSuccessChannel.class)) == null) {
            collection = C15750jb.LIZ.LIZ;
            o.LJIIIIZZ(collection, "inst().getAllFilter()");
        }
        arrayList.addAll(collection);
        this.LIZIZ.setLayoutManager(this.LIZJ);
        c43191ml.LLILIL(arrayList);
        this.LIZIZ.setAdapter(c43191ml);
        C88207Yjb.LIZLLL(this.LIZIZ);
        this.LIZIZ.post(new IDRunnableS85S0100000(this, 90));
        LIZIZ();
    }
}
