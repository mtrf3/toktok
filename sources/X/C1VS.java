package X;

import Y.IDRunnableS85S0100000;
import Y.IDfS292S0100000;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.effect.OnFilterSelectedByClickEvent;
import com.bytedance.android.live.effect.api.OnFilterSelectedEvent;
import com.bytedance.android.live.effect.filter.composerfilter.ComposerFilterViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1VS, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1VS extends AbstractC24260xK {
    public final DataChannel LIZLLL;
    public final ComposerFilterViewModel LJ;
    public LifecycleOwner LJFF;
    public final C43371n3 LJI;
    public final List<LiveEffect> LJII;
    public final String LJIIIIZZ;
    public Integer LJIIIZ;

    @Override // X.AbstractC24260xK
    public final void LIZ() {
        C88207Yjb.LIZLLL(this.LIZIZ);
    }

    public final void LIZIZ() {
        C73943T0h.LIZ().LIZLLL(this.LJFF, C11040c0.class, new InterfaceC73592SuS() { // from class: X.1VR
            @Override // X.InterfaceC73592SuS
            public final boolean test(Object it) {
                o.LJIIIZ(it, "it");
                return true;
            }
        }).LIZIZ(new IDfS292S0100000(this, 33));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1VS(ViewGroup parent, DataChannel dataChannel, ComposerFilterViewModel viewModel, LifecycleOwner lifecycleOwner) {
        super(parent);
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(viewModel, "viewModel");
        this.LIZLLL = dataChannel;
        this.LJ = viewModel;
        this.LJFF = lifecycleOwner;
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        C43371n3 c43371n3 = new C43371n3(context, viewModel, new InterfaceC17310m7() { // from class: X.1VQ
            @Override // X.InterfaceC17310m7
            public final void onItemClick(int i) {
                int i2;
                C1VS c1vs = C1VS.this;
                DataChannel dataChannel2 = c1vs.LIZLLL;
                if (dataChannel2 != null) {
                    dataChannel2.qv0(OnFilterSelectedEvent.class, ListProtector.get(c1vs.LJII, i));
                }
                DataChannel dataChannel3 = C1VS.this.LIZLLL;
                if (dataChannel3 != null) {
                    dataChannel3.qv0(OnFilterSelectedByClickEvent.class, Boolean.TRUE);
                }
                Integer num = C1VS.this.LJIIIZ;
                if (num == null || i != num.intValue()) {
                    Integer currentIndex = C1VS.this.LJIIIZ;
                    o.LJIIIIZZ(currentIndex, "currentIndex");
                    if (i < currentIndex.intValue()) {
                        i2 = 1;
                    } else {
                        i2 = 2;
                    }
                    C73943T0h.LIZ().LIZIZ(new C11040c0(i2));
                    C1VS.this.LJIIIZ = Integer.valueOf(i);
                }
            }
        });
        this.LJI = c43371n3;
        this.LJII = new ArrayList();
        this.LJIIIIZZ = C0TY.LIZ();
        this.LJIIIZ = InterfaceC30442Bx8.LJIJI.LIZJ();
        this.LIZIZ.setLayoutManager(this.LIZJ);
        this.LIZIZ.setAdapter(c43371n3);
        XKX.LIZLLL(ViewModelKt.getViewModelScope(viewModel), null, null, new C2F8(this, null), 3);
        XKX.LIZLLL(ViewModelKt.getViewModelScope(viewModel), null, null, new C2FF(this, null), 3);
        C88207Yjb.LIZLLL(this.LIZIZ);
        this.LIZIZ.post(new IDRunnableS85S0100000(this, 91));
        LIZIZ();
    }
}
