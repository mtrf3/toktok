package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.5i2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C142185i2 extends ConcurrentHashMap<String, VEUtils.VEVideoFileInfo> {
    public static final C142185i2 INSTANCE = new C142185i2();

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Set<Map.Entry<String, VEUtils.VEVideoFileInfo>> entrySet() {
        return getEntries();
    }

    public /* bridge */ java.util.Set<Map.Entry<String, VEUtils.VEVideoFileInfo>> getEntries() {
        return super.entrySet();
    }

    public /* bridge */ java.util.Set<String> getKeys() {
        return super.keySet();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<VEUtils.VEVideoFileInfo> getValues() {
        return super.values();
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Set<String> keySet() {
        return getKeys();
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<VEUtils.VEVideoFileInfo> values() {
        return getValues();
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return containsKey((String) obj);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof VEUtils.VEVideoFileInfo)) {
            return false;
        }
        return containsValue((VEUtils.VEVideoFileInfo) obj);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ VEUtils.VEVideoFileInfo get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return get((String) obj);
    }

    public final java.util.Map<String, VEUtils.VEVideoFileInfo> recheckCache(Intent intent) {
        o.LJIIIZ(intent, "intent");
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
        if (parcelableArrayListExtra != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = parcelableArrayListExtra.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                MediaModel mediaModel = (MediaModel) next;
                if (mediaModel.LJI()) {
                    C142185i2 c142185i2 = INSTANCE;
                    if (!c142185i2.contains(mediaModel.fileLocalUriPath) || c142185i2.get((Object) mediaModel.fileLocalUriPath) == null) {
                        arrayList.add(next);
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                MediaModel mediaModel2 = (MediaModel) it2.next();
                VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(mediaModel2.fileLocalUriPath);
                if (videoFileInfo != null) {
                    String str = mediaModel2.fileLocalUriPath;
                    o.LJIIIIZZ(str, "it.fileLocalUriPath");
                    put(str, videoFileInfo);
                }
            }
        }
        return this;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ VEUtils.VEVideoFileInfo remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return remove((String) obj);
    }

    public /* bridge */ boolean containsKey(String str) {
        return super.containsKey((Object) str);
    }

    public /* bridge */ boolean containsValue(VEUtils.VEVideoFileInfo vEVideoFileInfo) {
        return super.containsValue((Object) vEVideoFileInfo);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return get((String) obj);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return remove((String) obj);
    }

    public /* bridge */ VEUtils.VEVideoFileInfo get(String str) {
        return (VEUtils.VEVideoFileInfo) super.get((Object) str);
    }

    public /* bridge */ VEUtils.VEVideoFileInfo remove(String str) {
        return (VEUtils.VEVideoFileInfo) super.remove((Object) str);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof String)) {
            return obj2;
        }
        return getOrDefault((String) obj, (VEUtils.VEVideoFileInfo) obj2);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (!(obj instanceof String)) {
            return false;
        }
        if (obj2 != null && !(obj2 instanceof VEUtils.VEVideoFileInfo)) {
            return false;
        }
        return remove((String) obj, (VEUtils.VEVideoFileInfo) obj2);
    }

    public final /* bridge */ VEUtils.VEVideoFileInfo getOrDefault(Object obj, VEUtils.VEVideoFileInfo vEVideoFileInfo) {
        if (!(obj instanceof String)) {
            return vEVideoFileInfo;
        }
        return getOrDefault((String) obj, vEVideoFileInfo);
    }

    public /* bridge */ boolean remove(String str, VEUtils.VEVideoFileInfo vEVideoFileInfo) {
        return super.remove((Object) str, (Object) vEVideoFileInfo);
    }

    public /* bridge */ VEUtils.VEVideoFileInfo getOrDefault(String str, VEUtils.VEVideoFileInfo vEVideoFileInfo) {
        return (VEUtils.VEVideoFileInfo) super.getOrDefault((Object) str, (String) vEVideoFileInfo);
    }
}
