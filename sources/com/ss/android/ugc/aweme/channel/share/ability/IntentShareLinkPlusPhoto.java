package com.ss.android.ugc.aweme.channel.share.ability;

import X.AbstractC62625Ohx;
import X.C62313Ocv;
import X.C62508Og4;
import X.O18;
import android.content.Context;
import android.net.Uri;
import android.os.BaseBundle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.share.base.model.ShareContentType;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class IntentShareLinkPlusPhoto extends AbsIntentShare {
    public final ShareContentType LJLIL = ShareContentType.LINK_PLUS_PHOTO;

    @Override // com.ss.android.ugc.aweme.channel.share.ability.AbsIntentShare
    public final ShareContentType LIZJ() {
        return this.LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.channel.share.ability.AbsIntentShare
    public final AbstractC62625Ohx LIZ(Context context, C62508Og4 c62508Og4) {
        List<String> list = c62508Og4.LJLILLLLZI;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Uri LIZ = O18.LIZ(context, new File((String) ListProtector.get(list, 0)));
        o.LJIIIIZZ(LIZ, "FileProviderUtil.getFile…Uri(context, File(it[0]))");
        C62313Ocv c62313Ocv = new C62313Ocv(LIZ, (String) ListProtector.get(list, 0), AbsIntentShare.LIZLLL(c62508Og4), AbsIntentShare.LJ(c62508Og4), c62508Og4.LJLIL, null, false, 200);
        String str = c62313Ocv.LJFF;
        if (str == null) {
            str = "";
        }
        ((BaseBundle) c62313Ocv.LIZ).putString("content_url", str);
        ((BaseBundle) c62313Ocv.LIZ).putString("media_type", "image/*");
        return c62313Ocv;
    }
}
