package com.ss.android.ugc.aweme.shortvideo.ui.savelocal.moderation;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ModerationsRequest extends F9E {

    @InterfaceC65349Pkn("moderations")
    public final ArrayList<ModerationRequestModel> moderations;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ModerationsRequest copy$default(ModerationsRequest moderationsRequest, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = moderationsRequest.moderations;
        }
        return moderationsRequest.copy(arrayList);
    }

    public final ModerationsRequest copy(ArrayList<ModerationRequestModel> moderations) {
        o.LJIIIZ(moderations, "moderations");
        return new ModerationsRequest(moderations);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.moderations};
    }

    public final ArrayList<ModerationRequestModel> getModerations() {
        return this.moderations;
    }

    public ModerationsRequest(ArrayList<ModerationRequestModel> moderations) {
        o.LJIIIZ(moderations, "moderations");
        this.moderations = moderations;
    }
}
