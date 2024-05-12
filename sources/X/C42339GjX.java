package X;

import com.bytedance.keva.Keva;

/* renamed from: X.GjX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42339GjX extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C42339GjX LJLIL = new C42339GjX();

    public C42339GjX() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("bundle_timestamp_repo");
    }
}
