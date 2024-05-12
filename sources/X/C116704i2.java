package X;

import com.ss.android.ugc.gamora.editor.audioservice.service.speechtosong.model.StsResponse;
import java.util.ArrayList;

/* renamed from: X.4i2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C116704i2 extends ArrayList<StsResponse> {
    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof StsResponse)) {
            return false;
        }
        return contains((StsResponse) obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof StsResponse)) {
            return -1;
        }
        return indexOf((StsResponse) obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof StsResponse)) {
            return -1;
        }
        return lastIndexOf((StsResponse) obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof StsResponse)) {
            return false;
        }
        return remove((StsResponse) obj);
    }

    public /* bridge */ StsResponse removeAt(int i) {
        return remove(i);
    }

    public /* bridge */ boolean contains(StsResponse stsResponse) {
        return super.contains((Object) stsResponse);
    }

    public /* bridge */ int indexOf(StsResponse stsResponse) {
        return super.indexOf((Object) stsResponse);
    }

    public /* bridge */ int lastIndexOf(StsResponse stsResponse) {
        return super.lastIndexOf((Object) stsResponse);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ StsResponse remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ boolean remove(StsResponse stsResponse) {
        return super.remove((Object) stsResponse);
    }
}
