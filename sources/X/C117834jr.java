package X;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4jr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C117834jr {
    public static boolean LIZ(List<C117824jq> list) {
        if (list != null && !list.isEmpty()) {
            int i = 0;
            for (C117824jq c117824jq : list) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(EnumC117884jw.COLUMN_UUID.key, c117824jq.getMsgUuid());
                contentValues.put(EnumC117884jw.COLUMN_LOCAL_URI.key, c117824jq.getLocalPath());
                contentValues.put(EnumC117884jw.COLUMN_REMOTE_URI.key, c117824jq.getRemoteUrl());
                contentValues.put(EnumC117884jw.COLUMN_HASH.key, c117824jq.getHash());
                contentValues.put(EnumC117884jw.COLUMN_INDEX.key, Integer.valueOf(c117824jq.getIndex()));
                contentValues.put(EnumC117884jw.COLUMN_EXT.key, c117824jq.getExtStr());
                contentValues.put(EnumC117884jw.COLUMN_STATUS.key, Integer.valueOf(c117824jq.getStatus()));
                contentValues.put(EnumC117884jw.COLUMN_TYPE.key, c117824jq.getType());
                contentValues.put(EnumC117884jw.COLUMN_SIZE.key, Long.valueOf(c117824jq.getLength()));
                contentValues.put(EnumC117884jw.COLUMN_DISPLAY_TYPE.key, c117824jq.getDisplayType());
                contentValues.put(EnumC117884jw.COLUMN_MIME_TYPE.key, c117824jq.getMimeType());
                if (c117824jq.getUploadUri() != null) {
                    contentValues.put(EnumC117884jw.COLUMN_UPLOAD_URI.key, c117824jq.getUploadUri().toString());
                }
                if (C78847Ux1.LJJIL("attchment", contentValues) >= 0) {
                    i++;
                }
            }
            if (i != list.size()) {
                return false;
            }
        }
        return true;
    }

    public static C117824jq LIZIZ(InterfaceC63132Oq8 interfaceC63132Oq8) {
        C117824jq c117824jq = new C117824jq();
        c117824jq.setMsgUuid(interfaceC63132Oq8.getString(interfaceC63132Oq8.getColumnIndex(EnumC117884jw.COLUMN_UUID.key)));
        c117824jq.setLocalPath(interfaceC63132Oq8.getString(interfaceC63132Oq8.getColumnIndex(EnumC117884jw.COLUMN_LOCAL_URI.key)));
        c117824jq.setRemoteUrl(interfaceC63132Oq8.getString(interfaceC63132Oq8.getColumnIndex(EnumC117884jw.COLUMN_REMOTE_URI.key)));
        c117824jq.setIndex(interfaceC63132Oq8.getInt(interfaceC63132Oq8.getColumnIndex(EnumC117884jw.COLUMN_INDEX.key)));
        c117824jq.setLength(interfaceC63132Oq8.getLong(interfaceC63132Oq8.getColumnIndex(EnumC117884jw.COLUMN_SIZE.key)));
        c117824jq.setType(interfaceC63132Oq8.getString(interfaceC63132Oq8.getColumnIndex(EnumC117884jw.COLUMN_TYPE.key)));
        c117824jq.setExtStr(interfaceC63132Oq8.getString(interfaceC63132Oq8.getColumnIndex(EnumC117884jw.COLUMN_EXT.key)));
        c117824jq.setStatus(interfaceC63132Oq8.getInt(interfaceC63132Oq8.getColumnIndex(EnumC117884jw.COLUMN_STATUS.key)));
        c117824jq.setHash(interfaceC63132Oq8.getString(interfaceC63132Oq8.getColumnIndex(EnumC117884jw.COLUMN_HASH.key)));
        c117824jq.setDisplayType(interfaceC63132Oq8.getString(interfaceC63132Oq8.getColumnIndex(EnumC117884jw.COLUMN_DISPLAY_TYPE.key)));
        c117824jq.setMimeType(interfaceC63132Oq8.getString(interfaceC63132Oq8.getColumnIndex(EnumC117884jw.COLUMN_MIME_TYPE.key)));
        String string = interfaceC63132Oq8.getString(interfaceC63132Oq8.getColumnIndex(EnumC117884jw.COLUMN_UPLOAD_URI.key));
        if (!TextUtils.isEmpty(string)) {
            c117824jq.setUploadUri(UriProtector.parse(string));
        }
        return c117824jq;
    }

    public static List<C117824jq> LIZJ(InterfaceC63132Oq8 interfaceC63132Oq8) {
        if (interfaceC63132Oq8 == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(interfaceC63132Oq8.getCount());
        int columnIndex = interfaceC63132Oq8.getColumnIndex(EnumC117884jw.COLUMN_UUID.key);
        int columnIndex2 = interfaceC63132Oq8.getColumnIndex(EnumC117884jw.COLUMN_LOCAL_URI.key);
        int columnIndex3 = interfaceC63132Oq8.getColumnIndex(EnumC117884jw.COLUMN_REMOTE_URI.key);
        int columnIndex4 = interfaceC63132Oq8.getColumnIndex(EnumC117884jw.COLUMN_INDEX.key);
        int columnIndex5 = interfaceC63132Oq8.getColumnIndex(EnumC117884jw.COLUMN_SIZE.key);
        int columnIndex6 = interfaceC63132Oq8.getColumnIndex(EnumC117884jw.COLUMN_TYPE.key);
        int columnIndex7 = interfaceC63132Oq8.getColumnIndex(EnumC117884jw.COLUMN_EXT.key);
        int columnIndex8 = interfaceC63132Oq8.getColumnIndex(EnumC117884jw.COLUMN_STATUS.key);
        int columnIndex9 = interfaceC63132Oq8.getColumnIndex(EnumC117884jw.COLUMN_HASH.key);
        int columnIndex10 = interfaceC63132Oq8.getColumnIndex(EnumC117884jw.COLUMN_DISPLAY_TYPE.key);
        int columnIndex11 = interfaceC63132Oq8.getColumnIndex(EnumC117884jw.COLUMN_MIME_TYPE.key);
        int columnIndex12 = interfaceC63132Oq8.getColumnIndex(EnumC117884jw.COLUMN_UPLOAD_URI.key);
        while (interfaceC63132Oq8.moveToNext()) {
            C117824jq c117824jq = new C117824jq();
            c117824jq.setMsgUuid(interfaceC63132Oq8.getString(columnIndex));
            c117824jq.setLocalPath(interfaceC63132Oq8.getString(columnIndex2));
            c117824jq.setRemoteUrl(interfaceC63132Oq8.getString(columnIndex3));
            c117824jq.setIndex(interfaceC63132Oq8.getInt(columnIndex4));
            c117824jq.setLength(interfaceC63132Oq8.getLong(columnIndex5));
            c117824jq.setType(interfaceC63132Oq8.getString(columnIndex6));
            c117824jq.setExtStr(interfaceC63132Oq8.getString(columnIndex7));
            c117824jq.setStatus(interfaceC63132Oq8.getInt(columnIndex8));
            c117824jq.setHash(interfaceC63132Oq8.getString(columnIndex9));
            c117824jq.setDisplayType(interfaceC63132Oq8.getString(columnIndex10));
            c117824jq.setMimeType(interfaceC63132Oq8.getString(columnIndex11));
            String string = interfaceC63132Oq8.getString(columnIndex12);
            if (!TextUtils.isEmpty(string)) {
                c117824jq.setUploadUri(UriProtector.parse(string));
            }
            arrayList.add(c117824jq);
        }
        return arrayList;
    }

    public static List<C117824jq> LIZLLL(String str) {
        InterfaceC63132Oq8 interfaceC63132Oq8 = null;
        try {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("select * from attchment where ");
                LIZ.append(EnumC117884jw.COLUMN_UUID.key);
                LIZ.append("=?");
                interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(X1D.LIZIZ(LIZ), new String[]{str});
                ArrayList arrayList = new ArrayList(interfaceC63132Oq8.getCount());
                while (interfaceC63132Oq8.moveToNext()) {
                    C117824jq LIZIZ = LIZIZ(interfaceC63132Oq8);
                    if (LIZIZ != null) {
                        arrayList.add(LIZIZ);
                    }
                }
                return arrayList;
            } catch (Exception e) {
                C63322OtC.LJ("IMAttachmentDao getAttachments ", e);
                C63337OtR.LJ("IMAttachmentDao getAttachments", e);
                C63143OqJ.LIZ(interfaceC63132Oq8);
                return new ArrayList();
            }
        } finally {
            C63143OqJ.LIZ(interfaceC63132Oq8);
        }
    }

    public static boolean LJ(List<C117824jq> list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        for (C117824jq c117824jq : list) {
            if (c117824jq != null && !TextUtils.isEmpty(c117824jq.getMsgUuid())) {
                sb.append(",\"");
                sb.append(c117824jq.getMsgUuid());
                sb.append('\"');
            }
        }
        String sb2 = sb.toString();
        if (sb2.length() > 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("(");
            LIZ.append(sb2.substring(1));
            LIZ.append(")");
            String LIZIZ = X1D.LIZIZ(LIZ);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("delete from attchment where ");
            LIZ2.append(EnumC117884jw.COLUMN_UUID.key);
            LIZ2.append(" in ");
            LIZ2.append(LIZIZ);
            if (C78847Ux1.LJIL(X1D.LIZIZ(LIZ2))) {
                return LIZ(list);
            }
            return false;
        }
        return false;
    }
}
