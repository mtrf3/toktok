package X;

import android.media.AudioManager;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.BPv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C28743BPv implements AudioManager.OnAudioFocusChangeListener {
    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        Iterator it = new HashSet(C28742BPu.LIZJ).iterator();
        while (it.hasNext()) {
            ((AudioManager.OnAudioFocusChangeListener) it.next()).onAudioFocusChange(i);
        }
    }
}
