package com.twitter.sdk.android.core;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.q;
import com.google.gson.r;
import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import com.twitter.sdk.android.core.internal.oauth.OAuth2Token;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes12.dex */
public class AuthTokenAdapter implements r<AuthToken>, i<AuthToken> {
    public static final Map<String, Class<? extends AuthToken>> LIZIZ;
    public final Gson LIZ = new Gson();

    static {
        HashMap hashMap = new HashMap();
        LIZIZ = hashMap;
        hashMap.put("oauth1a", TwitterAuthToken.class);
        hashMap.put("oauth2", OAuth2Token.class);
        hashMap.put("guest", GuestAuthToken.class);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.twitter.sdk.android.core.AuthToken, java.lang.Object] */
    @Override // com.google.gson.i
    public final AuthToken deserialize(j jVar, Type type, h hVar) {
        m LJIIZILJ = jVar.LJIIZILJ();
        String LJJIFFI = LJIIZILJ.LJJIJL("auth_type").LJJIFFI();
        return GsonProtectorUtils.fromJson(this.LIZ, LJIIZILJ.LJJIJ("auth_token"), (Class) ((HashMap) LIZIZ).get(LJJIFFI));
    }

    @Override // com.google.gson.r
    public final j serialize(AuthToken authToken, Type type, q qVar) {
        String str;
        m mVar = new m();
        Class<?> cls = authToken.getClass();
        Iterator it = ((HashMap) LIZIZ).entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (entry.getValue().equals(cls)) {
                    str = (String) entry.getKey();
                    break;
                }
            } else {
                str = "";
                break;
            }
        }
        mVar.LJJIIZ("auth_type", str);
        mVar.LJJII("auth_token", GsonProtectorUtils.toJsonTree(this.LIZ, authToken));
        return mVar;
    }
}
