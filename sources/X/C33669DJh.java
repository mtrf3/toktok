package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.DJh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33669DJh extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C33669DJh LJLIL = new C33669DJh();

    public C33669DJh() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        Keva repo = Keva.getRepo("fc_cadc_track_record");
        o.LJIIIIZZ(repo, "getRepo(KEY_FC_CADC_TRACK_RECORD)");
        return repo;
    }
}
