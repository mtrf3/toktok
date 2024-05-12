package com.ss.android.ugc.aweme.legoImp.task;

import X.C03880Dg;
import X.C0RN;
import X.C16880lQ;
import X.C39519Ff9;
import X.C65300Pk0;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class InitFacebookAdsTask implements EE1 {
    public static Cursor LIZLLL(ContentResolver contentResolver, Uri uri, String[] strArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(240004, "android/content/ContentResolver", "query", contentResolver, new Object[]{uri, strArr, null, null, null}, "android.database.Cursor", new C65300Pk0(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "3569862264496497952"));
        return LIZJ.LIZ ? (Cursor) LIZJ.LIZIZ : contentResolver.query(uri, strArr, null, null, null);
    }

    @Override // X.EEY
    public final String key() {
        return "InitFacebookAdsTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.EE1
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public final /* synthetic */ int targetProcess() {
        return C0RN.LIZ();
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BOOT_FINISH;
    }

    public static byte[] LJII(String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) (Character.digit(str.charAt(i + 1), 16) + (Character.digit(str.charAt(i), 16) << 4));
        }
        return bArr;
    }

    public static Map LJIIJ(String str) {
        HashMap hashMap = new HashMap();
        for (String str2 : s.LJLJJL(str, new String[]{"&"}, 0, 6)) {
            if (s.LJJJLZIJ(str2, "=", false)) {
                List LJLJJL = s.LJLJJL(str2, new String[]{"="}, 0, 6);
                if (LJLJJL.size() > 1) {
                    hashMap.put(ListProtector.get(LJLJJL, 0), ListProtector.get(LJLJJL, 1));
                }
            }
        }
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x012f, code lost:
    
        if (r7 != null) goto L50;
     */
    @Override // X.EEY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run(android.content.Context r17) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.legoImp.task.InitFacebookAdsTask.run(android.content.Context):void");
    }

    public static String LJ(String str, String str2) {
        try {
            byte[] LJII = LJII("100555c36740ca167076b0e7034cbc2de901a1c0283a4f1dee647ed6a20e483b");
            byte[] LJII2 = LJII(str);
            byte[] LJII3 = LJII(str2);
            SecretKeySpec secretKeySpec = new SecretKeySpec(LJII, "AES");
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            o.LJIIIIZZ(cipher, "getInstance(\"AES/GCM/NoPadding\")");
            cipher.init(2, secretKeySpec, new GCMParameterSpec(128, LJII3));
            byte[] doFinal = cipher.doFinal(LJII2);
            o.LJIIIIZZ(doFinal, "aesGcmCipher.doFinal(cipher)");
            Charset UTF_8 = StandardCharsets.UTF_8;
            o.LJIIIIZZ(UTF_8, "UTF_8");
            return new String(doFinal, UTF_8);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }
}
