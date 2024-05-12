package com.ss.android.ugc.aweme.deeplink.actions;

import X.AbstractC54341LUj;
import X.C47261Igj;
import X.C55837Lvl;
import X.C76800UCe;
import X.M5K;
import X.M5X;
import X.M62;
import X.OSZ;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ItemAction extends AbstractC54341LUj<C76800UCe> {
    public boolean shouldInsertFeed;

    @Override // X.AbstractC54341LUj
    public ArrayList<Integer> getFlags() {
        if (this.shouldInsertFeed) {
            return C47261Igj.LJII(268435456, 67108864);
        }
        return super.getFlags();
    }

    @Override // X.AbstractC54341LUj
    public OSZ<String, HashMap<String, Object>> buildInnerUrl(String outerUrl, HashMap<String, Object> originalQueryMap, M5X deepLinkData) {
        String str;
        o.LJIIIZ(outerUrl, "outerUrl");
        o.LJIIIZ(originalQueryMap, "originalQueryMap");
        o.LJIIIZ(deepLinkData, "deepLinkData");
        Uri parse = UriProtector.parse(outerUrl);
        HashMap hashMap = new HashMap();
        Object obj = deepLinkData.LJLJJL.get("is_from_notification");
        o.LJII(obj, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = ((Boolean) obj).booleanValue();
        String lastPathSegment = parse.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        boolean LJII = C55837Lvl.LJII(parse, booleanValue, lastPathSegment, M5K.LJI(), M5K.LJIIIZ(parse));
        this.shouldInsertFeed = LJII;
        if (LJII) {
            C55837Lvl.LIZLLL(lastPathSegment, hashMap);
            str = "aweme://main";
        } else {
            str = "aweme://detail";
        }
        C55837Lvl.LIZ(parse, hashMap, booleanValue);
        hashMap.put("refer", "web");
        hashMap.put("id", lastPathSegment);
        M62.LIZIZ.LIZIZ(parse, "detail", booleanValue);
        return new OSZ<>(str, hashMap);
    }
}
