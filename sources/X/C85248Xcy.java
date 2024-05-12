package X;

import com.bytedance.bdlocation.df.ILocationPluginInstallListener;

/* renamed from: X.Xcy, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85248Xcy implements ILocationPluginInstallListener {
    @Override // com.bytedance.bdlocation.df.ILocationPluginInstallListener
    public final void onFailed(String str, boolean z, int i) {
    }

    @Override // com.bytedance.bdlocation.df.ILocationPluginInstallListener
    public final void onSuccess(String str, boolean z) {
        C38995FSd.LJFF().execute(RunnableC85247Xcx.LJLIL);
    }
}
