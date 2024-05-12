package com.ss.android.ugc.aweme.favorites.agents;

import X.C38333F2r;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import X.InterfaceC2062687q;
import X.InterfaceC2062787r;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.google.gson.u;
import com.ss.android.ugc.aweme.favorites.business.aweme.AwemeCollectionAgent;
import com.ss.android.ugc.aweme.favorites.business.aweme.AwemeCollectionCountAgent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class AwemeCollectionTypeAdapterFactory implements u {
    @Override // com.google.gson.u
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        final TypeAdapter<T> typeAdapter = null;
        if (typeToken == null || !Aweme.class.isAssignableFrom(typeToken.getRawType())) {
            return null;
        }
        if (gson != null) {
            typeAdapter = gson.LJIIJJI(this, typeToken);
        }
        return new TypeAdapter<T>() { // from class: com.ss.android.ugc.aweme.favorites.agents.AwemeCollectionTypeAdapterFactory$create$1
            /* JADX WARN: Type inference failed for: r4v2, types: [T, com.ss.android.ugc.aweme.feed.model.Aweme] */
            @Override // com.google.gson.TypeAdapter
            public final T read(C65385PlN c65385PlN) {
                EnumC65386PlO enumC65386PlO;
                Object obj = null;
                if (c65385PlN != null) {
                    enumC65386PlO = c65385PlN.LJJIJIL();
                } else {
                    enumC65386PlO = null;
                }
                if (enumC65386PlO == EnumC65386PlO.NULL) {
                    c65385PlN.LJJIIJ();
                    return null;
                }
                try {
                    TypeAdapter<T> typeAdapter2 = typeAdapter;
                    if (typeAdapter2 != null) {
                        obj = typeAdapter2.read(c65385PlN);
                    }
                    o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
                    ?? r4 = (T) ((Aweme) obj);
                    if (r4.getAid() != null) {
                        InterfaceC2062687q LJIIZILJ = AwemeCollectionAgent.LJIIZILJ();
                        String aid = r4.getAid();
                        o.LJIIIIZZ(aid, "it.aid");
                        LJIIZILJ.LJIIJ(Boolean.valueOf(r4.isCollected()), aid);
                        if (r4.getStatistics() != null) {
                            InterfaceC2062787r LJIILJJIL = AwemeCollectionCountAgent.LJIILJJIL();
                            String aid2 = r4.getAid();
                            o.LJIIIIZZ(aid2, "it.aid");
                            LJIILJJIL.LJIIJ(Long.valueOf(r4.getStatistics().getCollectCount()), aid2);
                        } else {
                            InterfaceC2062787r LJIILJJIL2 = AwemeCollectionCountAgent.LJIILJJIL();
                            String aid3 = r4.getAid();
                            o.LJIIIIZZ(aid3, "it.aid");
                            LJIILJJIL2.LJIIJ(0L, aid3);
                        }
                    }
                    return r4;
                } catch (n e) {
                    Throwable cause = e.getCause();
                    if (cause != null && (cause instanceof C38333F2r)) {
                        Throwable cause2 = e.getCause();
                        o.LJII(cause2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException");
                        throw cause2;
                    }
                    throw e;
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C65403Plf c65403Plf, T t) {
                if (t == null) {
                    if (c65403Plf != null) {
                        c65403Plf.LJIIJJI();
                    }
                } else {
                    TypeAdapter<T> typeAdapter2 = typeAdapter;
                    if (typeAdapter2 == null) {
                        return;
                    }
                    typeAdapter2.write(c65403Plf, t);
                }
            }
        };
    }
}
