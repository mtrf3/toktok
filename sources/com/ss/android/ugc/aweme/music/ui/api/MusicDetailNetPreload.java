package com.ss.android.ugc.aweme.music.ui.api;

import X.C16880lQ;
import X.C38827FLr;
import X.X8M;
import android.os.Bundle;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.music.api.MusicDetailApi;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import java.util.concurrent.Future;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class MusicDetailNetPreload implements X8M<MusicDetailApi.DetailApi, Future<MusicDetail>> {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r7 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        r1 = X.C56543MHb.LIZ;
        r0 = java.lang.String.valueOf(r2);
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (X.C56543MHb.LIZ(r4, r0) != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        X.C56543MHb.LIZ.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (X.C56543MHb.LIZ(r1, r5) != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0021, code lost:
    
        r0 = r7.getString("partnerName");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0027, code lost:
    
        if (r0 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        r5 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r1 == null) goto L11;
     */
    @Override // X.X8D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean enable(android.os.Bundle r7) {
        /*
            r6 = this;
            java.lang.String r5 = ""
            if (r7 == 0) goto Lc
            java.lang.String r0 = "id"
            java.lang.String r4 = r7.getString(r0)
            if (r4 != 0) goto Ld
        Lc:
            r4 = r5
        Ld:
            r3 = 0
            if (r7 == 0) goto L4e
            java.lang.String r0 = "click_reason"
            int r2 = r7.getInt(r0)
            java.lang.String r0 = "partnerMusicId"
            java.lang.String r1 = r7.getString(r0)
            if (r1 != 0) goto L21
        L1e:
            r1 = r5
            if (r7 == 0) goto L29
        L21:
            java.lang.String r0 = "partnerName"
            java.lang.String r0 = r7.getString(r0)
            if (r0 != 0) goto L4c
        L29:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L40
            X.MHb r1 = X.C56543MHb.LIZ
            java.lang.String r0 = java.lang.String.valueOf(r2)
            r1.getClass()
            com.ss.android.ugc.aweme.music.model.MusicDetail r0 = X.C56543MHb.LIZ(r4, r0)
            if (r0 != 0) goto L3f
        L3e:
            r3 = 1
        L3f:
            return r3
        L40:
            X.MHb r0 = X.C56543MHb.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.music.model.MusicDetail r0 = X.C56543MHb.LIZ(r1, r5)
            if (r0 != 0) goto L3f
            goto L3e
        L4c:
            r5 = r0
            goto L29
        L4e:
            r2 = 0
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.ui.api.MusicDetailNetPreload.enable(android.os.Bundle):boolean");
    }

    @Override // X.X8M
    public C38827FLr getPreloadStrategy(Bundle bundle) {
        return new C38827FLr(0, Api.LIZ, false, 5);
    }

    @Override // X.X8M
    public boolean handleException(Exception exception) {
        o.LJIIIZ(exception, "exception");
        C16880lQ.LLLLIIL(exception);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if (r12 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        r6 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if (r12 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        r9 = r12.getString("aweme_id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (r9 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r12 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        r0 = r12.getString("video_id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        if (r0 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        r8 = java.lang.Integer.valueOf(r12.getInt("extra_enter_from", 0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        r5 = com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl.LIZJ().LJIIZILJ();
        r2 = new java.util.TreeMap();
        r2.put("item_id", r9);
        r2.put("video_id", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (r8 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        if (android.text.TextUtils.isEmpty(r7) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        if (X.C44208HWq.LIZ == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
    
        r1 = r13.invoke(com.ss.android.ugc.aweme.music.api.MusicDetailApi.DetailApi.class).queryMusicWithHighPriority(r4, r3, r5 ? 1 : 0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007b, code lost:
    
        kotlin.jvm.internal.o.LJIIIIZZ(r1, "{\n            if (Studio…)\n            }\n        }");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0081, code lost:
    
        r1 = r13.invoke(com.ss.android.ugc.aweme.music.api.MusicDetailApi.DetailApi.class).queryMusic(r4, r3, r5 ? 1 : 0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008e, code lost:
    
        r1 = r13.invoke(com.ss.android.ugc.aweme.music.api.MusicDetailApi.DetailApi.class).queryPartnerMusic(r7, r6);
        kotlin.jvm.internal.o.LJIIIIZZ(r1, "{\n            create.inv… parameterName)\n        }");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a5, code lost:
    
        if (r8.intValue() != 1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a7, code lost:
    
        r2.put("enter_from", r8.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b1, code lost:
    
        r10 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b3, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0039, code lost:
    
        r9 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0026, code lost:
    
        r6 = r12.getString("partnerName");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x002c, code lost:
    
        if (r6 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r7 == null) goto L11;
     */
    @Override // X.X8M
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.concurrent.Future<com.ss.android.ugc.aweme.music.model.MusicDetail> preload(android.os.Bundle r12, X.InterfaceC88472Yns<? super java.lang.Class<com.ss.android.ugc.aweme.music.api.MusicDetailApi.DetailApi>, ? extends com.ss.android.ugc.aweme.music.api.MusicDetailApi.DetailApi> r13) {
        /*
            r11 = this;
            java.lang.String r0 = "create"
            kotlin.jvm.internal.o.LJIIIZ(r13, r0)
            java.lang.String r10 = ""
            if (r12 == 0) goto L11
            java.lang.String r0 = "id"
            java.lang.String r4 = r12.getString(r0)
            if (r4 != 0) goto L12
        L11:
            r4 = r10
        L12:
            r2 = 0
            if (r12 == 0) goto Lb5
            java.lang.String r0 = "click_reason"
            int r3 = r12.getInt(r0)
            java.lang.String r0 = "partnerMusicId"
            java.lang.String r7 = r12.getString(r0)
            if (r7 != 0) goto L26
        L23:
            r7 = r10
            if (r12 == 0) goto L2e
        L26:
            java.lang.String r0 = "partnerName"
            java.lang.String r6 = r12.getString(r0)
            if (r6 != 0) goto L31
        L2e:
            r6 = r10
            if (r12 == 0) goto L39
        L31:
            java.lang.String r0 = "aweme_id"
            java.lang.String r9 = r12.getString(r0)
            if (r9 != 0) goto L3a
        L39:
            r9 = r10
        L3a:
            java.lang.String r1 = "video_id"
            if (r12 == 0) goto Lb3
            java.lang.String r0 = r12.getString(r1)
            if (r0 != 0) goto Lb1
        L44:
            java.lang.String r0 = "extra_enter_from"
            int r0 = r12.getInt(r0, r2)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
        L4e:
            com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService r0 = com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl.LIZJ()
            boolean r5 = r0.LJIIZILJ()
            java.util.TreeMap r2 = new java.util.TreeMap
            r2.<init>()
            java.lang.String r0 = "item_id"
            r2.put(r0, r9)
            r2.put(r1, r10)
            if (r8 != 0) goto La0
        L65:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L8e
            boolean r0 = X.C44208HWq.LIZ
            if (r0 == 0) goto L81
            java.lang.Class<com.ss.android.ugc.aweme.music.api.MusicDetailApi$DetailApi> r0 = com.ss.android.ugc.aweme.music.api.MusicDetailApi.DetailApi.class
            java.lang.Object r0 = r13.invoke(r0)
            com.ss.android.ugc.aweme.music.api.MusicDetailApi$DetailApi r0 = (com.ss.android.ugc.aweme.music.api.MusicDetailApi.DetailApi) r0
            X.76L r1 = r0.queryMusicWithHighPriority(r4, r3, r5, r2)
        L7b:
            java.lang.String r0 = "{\n            if (Studio…)\n            }\n        }"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
        L80:
            return r1
        L81:
            java.lang.Class<com.ss.android.ugc.aweme.music.api.MusicDetailApi$DetailApi> r0 = com.ss.android.ugc.aweme.music.api.MusicDetailApi.DetailApi.class
            java.lang.Object r0 = r13.invoke(r0)
            com.ss.android.ugc.aweme.music.api.MusicDetailApi$DetailApi r0 = (com.ss.android.ugc.aweme.music.api.MusicDetailApi.DetailApi) r0
            X.76L r1 = r0.queryMusic(r4, r3, r5, r2)
            goto L7b
        L8e:
            java.lang.Class<com.ss.android.ugc.aweme.music.api.MusicDetailApi$DetailApi> r0 = com.ss.android.ugc.aweme.music.api.MusicDetailApi.DetailApi.class
            java.lang.Object r0 = r13.invoke(r0)
            com.ss.android.ugc.aweme.music.api.MusicDetailApi$DetailApi r0 = (com.ss.android.ugc.aweme.music.api.MusicDetailApi.DetailApi) r0
            X.76L r1 = r0.queryPartnerMusic(r7, r6)
            java.lang.String r0 = "{\n            create.inv… parameterName)\n        }"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            goto L80
        La0:
            int r1 = r8.intValue()
            r0 = 1
            if (r1 != r0) goto L65
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = r8.toString()
            r2.put(r1, r0)
            goto L65
        Lb1:
            r10 = r0
            goto L44
        Lb3:
            r8 = 0
            goto L4e
        Lb5:
            r3 = 0
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.ui.api.MusicDetailNetPreload.preload(android.os.Bundle, X.Yns):X.76L");
    }
}
