package X;

import android.util.Pair;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes11.dex */
public final class ODM extends AbstractC61551ODr<String, java.util.Map<String, List<Pair<String, Long>>>> {
    @Override // X.AbstractC61551ODr
    public final void LIZ(Object... objArr) {
        ((Boolean) objArr[0]).booleanValue();
    }

    @Override // X.AbstractC61551ODr
    public final Object LIZIZ(C61548ODo c61548ODo, Object obj) {
        Long LIZJ;
        OC6.LIZ("gecko-debug-tag", "get local channel version");
        C61532OCy c61532OCy = EBC.LIZ;
        c61532OCy.LIZIZ();
        File rootDirectory = c61532OCy.LJ.getRootDirectory();
        HashMap hashMap = new HashMap();
        File[] listFiles = rootDirectory.listFiles();
        if (listFiles != null && listFiles.length > 0) {
            for (File file : listFiles) {
                String name = file.getName();
                String[] list = file.list();
                ArrayList arrayList = new ArrayList();
                if (list != null && list.length > 0) {
                    for (String str : list) {
                        File file2 = new File(file, str);
                        if (file2.isDirectory() && (LIZJ = OAS.LIZJ(file2)) != null) {
                            arrayList.add(new Pair(str, LIZJ));
                        }
                    }
                }
                List list2 = (List) hashMap.get(name);
                if (list2 != null) {
                    list2.addAll(arrayList);
                } else {
                    hashMap.put(name, arrayList);
                }
            }
        }
        return c61548ODo.LJ(hashMap);
    }
}
