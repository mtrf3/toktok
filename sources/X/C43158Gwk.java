package X;

import com.bytedance.keva.Keva;

/* renamed from: X.Gwk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43158Gwk extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C43158Gwk LJLIL = new C43158Gwk();

    public C43158Gwk() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("keva_repo_resume_upload_from_disk_record");
    }
}
