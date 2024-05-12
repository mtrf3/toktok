package com.ss.android.ugc.aweme.inbox.skylight.plat;

import X.C184077Kh;
import X.C214378bB;
import X.C214528bQ;
import X.C53339KwZ;
import X.C54046LJa;
import X.C65352Pkq;
import X.C78926UyI;
import X.LJT;
import X.LJX;
import X.LJY;
import X.LJZ;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.ISkylightOutBridge;
import com.ss.android.ugc.aweme.story.inbox.view.StoryInboxCell;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class InboxSkylightService implements ISkylightOutBridge {
    @Override // com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.ISkylightOutBridge
    public final LJT LIZ(StoryInboxCell owner) {
        o.LJIIIZ(owner, "owner");
        if (C53339KwZ.LJ()) {
            LJZ ljz = LJZ.LJLIL;
            return (SkylightMediaListViewModel) new C214378bB(C65352Pkq.LIZ(SkylightMediaListViewModel.class), ljz, C214528bQ.LJLIL, C78926UyI.LJJII(owner, false), C184077Kh.LJLIL, LJX.INSTANCE, null, null).getValue();
        }
        C54046LJa c54046LJa = C54046LJa.LJLIL;
        return (SkylightListViewModel) new C214378bB(C65352Pkq.LIZ(SkylightListViewModel.class), c54046LJa, C214528bQ.LJLIL, C78926UyI.LJJII(owner, false), C184077Kh.LJLIL, LJY.INSTANCE, null, null).getValue();
    }
}
