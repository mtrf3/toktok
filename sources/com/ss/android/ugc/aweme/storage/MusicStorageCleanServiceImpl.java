package com.ss.android.ugc.aweme.storage;

import X.C48317Ixl;
import X.C48325Ixt;
import X.C48327Ixv;
import X.H7B;
import X.RunnableC48320Ixo;
import com.ss.android.ugc.aweme.music.service.IMusicStorageCleanService;
import defpackage.e1;
import kotlin.jvm.internal.AqS173S0100000_7;

/* loaded from: classes9.dex */
public final class MusicStorageCleanServiceImpl implements IMusicStorageCleanService {
    @Override // com.ss.android.ugc.aweme.music.service.IMusicStorageCleanService
    public final void LIZ(AqS173S0100000_7 aqS173S0100000_7) {
        if (!e1.LIZ(31744, "creative_tools_open_music_cache", true, false)) {
            aqS173S0100000_7.invoke(0L);
        }
        C48327Ixv.LIZ();
        C48317Ixl c48317Ixl = C48325Ixt.LIZJ;
        if (c48317Ixl != null) {
            H7B.LIZ("MusicDiskLruCache try to remove unused key.");
            c48317Ixl.LIZLLL.execute(new RunnableC48320Ixo(c48317Ixl, aqS173S0100000_7));
        }
    }
}
