package com.bytedance.android.live.liveinteract.multihost.biz.link.contract;

import X.AbstractC76019TsV;
import X.C75981Trt;
import android.view.View;
import com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes14.dex */
public abstract class MultiCoHostInviteListContract$AbsView extends InteractDialogFragmentBaseContract$AbsView<AbstractC76019TsV> {
    public static final /* synthetic */ int LJLJLJ = 0;
    public long LJLJJI;
    public long LJLJJL;
    public boolean LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();

    public abstract void Al(Throwable th);

    public abstract void Dl(boolean z, boolean z2, C75981Trt c75981Trt, int i, int i2, boolean z3);

    public abstract void Gl(Throwable th, Room room);

    public abstract void Hl();

    public abstract void Il();

    public abstract void Jl(int i);

    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    public abstract void a();

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public abstract void sc(Throwable th);

    public abstract boolean wl();

    public abstract void xl();
}
