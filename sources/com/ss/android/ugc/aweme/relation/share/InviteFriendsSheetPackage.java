package com.ss.android.ugc.aweme.relation.share;

import X.AbstractC62625Ohx;
import X.C62224ObU;
import X.C62374Odu;
import X.C86V;
import X.InterfaceC62225ObV;
import X.OY5;
import X.OYF;
import X.OYP;
import X.Q8U;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class InviteFriendsSheetPackage extends SharePackage {
    public static final OY5 Companion = new OY5();
    public final String shareTextTemplate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InviteFriendsSheetPackage(C62374Odu c62374Odu) {
        super(c62374Odu);
        String LJFF = C86V.LJFF(R.string.r53);
        o.LJIIIIZZ(LJFF, "getString(R.string.share_panel_invite_ext_copy)");
        this.shareTextTemplate = LJFF;
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final AbstractC62625Ohx LJIIJJI(InterfaceC62225ObV channel) {
        o.LJIIIZ(channel, "channel");
        String LIZJ = OYF.LIZJ(channel, this.url, this.itemType);
        String key = channel.key();
        int hashCode = key.hashCode();
        if (hashCode != 3059573) {
            if (hashCode != 96619420) {
                if (hashCode == 497130182 && key.equals("facebook")) {
                    return new OYP(LIZJ, ujb.o.LJJJJZ(this.shareTextTemplate, "%s", "", false), 4);
                }
            } else if (key.equals("email")) {
                return new OYP(Q8U.LIZIZ(new Object[]{LIZJ}, 1, this.shareTextTemplate, "format(this, *args)"), this.title, 4);
            }
        } else if (key.equals("copy")) {
            return new OYP(LIZJ, (String) null, 6);
        }
        return new C62224ObU(Q8U.LIZIZ(new Object[]{LIZJ}, 1, this.shareTextTemplate, "format(this, *args)"), null);
    }
}
