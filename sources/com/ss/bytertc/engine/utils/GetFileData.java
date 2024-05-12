package com.ss.bytertc.engine.utils;

import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.realx.base.ContextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes33.dex */
public class GetFileData {
    public static ByteBuffer convertDirectBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        if (byteBuffer.isDirect()) {
            return byteBuffer;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteBuffer.remaining());
        allocateDirect.position(0);
        allocateDirect.put(byteBuffer);
        allocateDirect.rewind();
        return allocateDirect;
    }

    public static ByteBuffer readFile(String str) {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (str.startsWith("/assets/") && applicationContext != null) {
            return getAssets(applicationContext, str.substring(8));
        }
        if (str.startsWith("content://") && applicationContext != null) {
            return getOthers(applicationContext, str);
        }
        return null;
    }

    public static ByteBuffer getAssets(Context context, String str) {
        try {
            InputStream open = context.getResources().getAssets().open(str);
            if (open == null) {
                return null;
            }
            byte[] bArr = new byte[open.available()];
            int read = open.read(bArr);
            open.close();
            if (read <= 0) {
                return null;
            }
            return convertDirectBuffer(ByteBuffer.wrap(bArr));
        } catch (IOException unused) {
            return null;
        }
    }

    public static ByteBuffer getOthers(Context context, String str) {
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(UriProtector.parse(str));
            if (openInputStream == null) {
                return null;
            }
            byte[] bArr = new byte[openInputStream.available()];
            int read = openInputStream.read(bArr);
            openInputStream.close();
            if (read <= 0) {
                return null;
            }
            return convertDirectBuffer(ByteBuffer.wrap(bArr));
        } catch (Exception unused) {
            return null;
        }
    }
}
