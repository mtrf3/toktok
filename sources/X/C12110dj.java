package X;

import Y.IDComparatorS28S0000000;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.i0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0dj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12110dj {
    public static final IDComparatorS28S0000000 LIZ = new IDComparatorS28S0000000(10);

    public static C12170dp LIZ(Context context, C12120dk c12120dk) {
        int i;
        int i2;
        android.net.Uri withAppendedId;
        int i3;
        boolean z;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = c12120dk.LIZ;
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (resolveContentProvider != null) {
            if (resolveContentProvider.packageName.equals(c12120dk.LIZIZ)) {
                Signature[] signatureArr = C16880lQ.LLLLLLZ(packageManager, resolveContentProvider.packageName, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    arrayList.add(signature.toByteArray());
                }
                IDComparatorS28S0000000 iDComparatorS28S0000000 = LIZ;
                Collections.sort(arrayList, iDComparatorS28S0000000);
                List<List<byte[]>> list = c12120dk.LIZLLL;
                if (list == null) {
                    list = C0OU.LIZIZ(resources, 0);
                }
                int i4 = 0;
                while (true) {
                    Cursor cursor = null;
                    if (i4 < list.size()) {
                        ArrayList arrayList2 = new ArrayList((Collection) ListProtector.get(list, i4));
                        Collections.sort(arrayList2, iDComparatorS28S0000000);
                        if (arrayList.size() == arrayList2.size()) {
                            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                                if (!Arrays.equals((byte[]) ListProtector.get(arrayList, i5), (byte[]) ListProtector.get(arrayList2, i5))) {
                                    break;
                                }
                            }
                            String str2 = resolveContentProvider.authority;
                            ArrayList arrayList3 = new ArrayList();
                            android.net.Uri build = new Uri.Builder().scheme("content").authority(str2).build();
                            android.net.Uri build2 = new Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
                            try {
                                cursor = C12100di.LIZ(context.getContentResolver(), build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{c12120dk.LIZJ}, null, null);
                                if (cursor != null) {
                                    if (cursor.getCount() > 0) {
                                        int columnIndex = cursor.getColumnIndex("result_code");
                                        arrayList3 = new ArrayList();
                                        int columnIndex2 = cursor.getColumnIndex("_id");
                                        int columnIndex3 = cursor.getColumnIndex("file_id");
                                        int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                                        int columnIndex5 = cursor.getColumnIndex("font_weight");
                                        int columnIndex6 = cursor.getColumnIndex("font_italic");
                                        while (cursor.moveToNext()) {
                                            if (columnIndex != -1) {
                                                i = cursor.getInt(columnIndex);
                                            } else {
                                                i = 0;
                                            }
                                            if (columnIndex4 != -1) {
                                                i2 = cursor.getInt(columnIndex4);
                                            } else {
                                                i2 = 0;
                                            }
                                            if (columnIndex3 == -1) {
                                                withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                                            } else {
                                                withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                                            }
                                            if (columnIndex5 != -1) {
                                                i3 = cursor.getInt(columnIndex5);
                                            } else {
                                                i3 = LiveChatShowDelayForHotLiveSetting.DEFAULT;
                                            }
                                            if (columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            arrayList3.add(new C12180dq(withAppendedId, i2, i3, z, i));
                                        }
                                    }
                                    cursor.close();
                                }
                                return new C12170dp(0, (C12180dq[]) arrayList3.toArray(new C12180dq[0]));
                            } catch (Throwable th) {
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        }
                        i4++;
                    } else {
                        return new C12170dp(1, null);
                    }
                }
            } else {
                StringBuilder LIZIZ = C25620zW.LIZIZ("Found content provider ", str, ", but package was not ");
                LIZIZ.append(c12120dk.LIZIZ);
                throw new PackageManager.NameNotFoundException(X1D.LIZIZ(LIZIZ));
            }
        } else {
            throw new PackageManager.NameNotFoundException(i0.LJFF("No package found for authority: ", str));
        }
    }
}
