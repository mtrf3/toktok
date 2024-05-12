package X;

import com.ss.android.ugc.localnotify.database.WorkManagerTaskDatabase;

/* renamed from: X.QuK, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68488QuK extends C1CG<C68476Qu8> {
    @Override // X.C0BI
    public final String LIZIZ() {
        return "INSERT OR REPLACE INTO `workmanager_task` (`id`,`rule_id`,`type`,`scheduled_date_timestamp`,`interval_index`,`time_offset`,`scheduled_timestamp`,`actual_timestamp`,`is_executed`,`is_published`,`extra`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
    }

    public C68488QuK(WorkManagerTaskDatabase workManagerTaskDatabase) {
        super(workManagerTaskDatabase);
    }

    @Override // X.C1CG
    public final void LIZLLL(InterfaceC37591dj interfaceC37591dj, C68476Qu8 c68476Qu8) {
        C68476Qu8 c68476Qu82 = c68476Qu8;
        String str = c68476Qu82.LJLIL;
        if (str == null) {
            interfaceC37591dj.LLLLLLJ(1);
        } else {
            interfaceC37591dj.LJJII(1, str);
        }
        interfaceC37591dj.LJIIIZ(2, c68476Qu82.LJLILLLLZI);
        interfaceC37591dj.LJIIIZ(3, c68476Qu82.LJLJI);
        interfaceC37591dj.LJIIIZ(4, c68476Qu82.LJLJJI);
        interfaceC37591dj.LJIIIZ(5, c68476Qu82.LJLJJL);
        interfaceC37591dj.LJIIIZ(6, c68476Qu82.LJLJJLL);
        interfaceC37591dj.LJIIIZ(7, c68476Qu82.LJLJL);
        interfaceC37591dj.LJIIIZ(8, c68476Qu82.LJLJLJ);
        interfaceC37591dj.LJIIIZ(9, c68476Qu82.LJLJLLL ? 1L : 0L);
        interfaceC37591dj.LJIIIZ(10, c68476Qu82.LJLL ? 1L : 0L);
        String str2 = c68476Qu82.LJLLI;
        if (str2 == null) {
            interfaceC37591dj.LLLLLLJ(11);
        } else {
            interfaceC37591dj.LJJII(11, str2);
        }
    }
}
