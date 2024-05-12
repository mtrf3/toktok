package X;

import com.ss.android.ugc.aweme.commerce.tools.music.promote.PromoteReplaceMusicDataExpireTimeSetting;

/* renamed from: X.GoC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42628GoC extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C42628GoC LJLIL = new C42628GoC();

    public C42628GoC() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(PromoteReplaceMusicDataExpireTimeSetting.get());
    }
}
