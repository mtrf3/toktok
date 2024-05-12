package X;

import com.ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;

/* renamed from: X.EcE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36790EcE implements F67 {
    @Override // X.F67
    public final void onChanged() {
        SettingsManagerProxy.inst().notifySettingsChange();
        SpecActServiceImpl.LJJJIL().LJJIFFI();
    }
}
