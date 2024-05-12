package X;

import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: X.5Ge, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132045Ge implements Serializable {
    public transient VideoPublishEditModel LJLIL;
    public String LJLILLLLZI;
    public ArrayList<OSZ<String, String>> LJLJI;
    public boolean LJLJJI;
    public ArrayList<AVMusic> LJLJJL;
    public String LJLJJLL;
    public boolean LJLJL;
    public String LJLJLJ;
    public String LJLJLLL;
    public long LJLL;
    public boolean LJLLI;

    public final VideoPublishEditModel getEditModel() {
        return this.LJLIL;
    }

    public final String getEditorProAnchorType() {
        return this.LJLILLLLZI;
    }

    public final boolean getEffectMultiTrackMode() {
        return this.LJLJJI;
    }

    public final String getEnterFrom() {
        return this.LJLJLJ;
    }

    public final long getEnterMovePos() {
        return this.LJLL;
    }

    public final String getEnterSelectSlotId() {
        return this.LJLJLLL;
    }

    public final ArrayList<OSZ<String, String>> getInlineCaptionCaches() {
        return this.LJLJI;
    }

    public final boolean getRestoreFromSavedInstanceState() {
        return this.LJLLI;
    }

    public final String getRetakeCommitId() {
        return this.LJLJJLL;
    }

    public final ArrayList<AVMusic> getStickPointMusicList() {
        return this.LJLJJL;
    }

    public final boolean isFromText() {
        return this.LJLJL;
    }

    public final void setEditModel(VideoPublishEditModel videoPublishEditModel) {
        this.LJLIL = videoPublishEditModel;
    }

    public final void setEditorProAnchorType(String str) {
        this.LJLILLLLZI = str;
    }

    public final void setEffectMultiTrackMode(boolean z) {
        this.LJLJJI = z;
    }

    public final void setEnterFrom(String str) {
        this.LJLJLJ = str;
    }

    public final void setEnterMovePos(long j) {
        this.LJLL = j;
    }

    public final void setEnterSelectSlotId(String str) {
        this.LJLJLLL = str;
    }

    public final void setFromText(boolean z) {
        this.LJLJL = z;
    }

    public final void setInlineCaptionCaches(ArrayList<OSZ<String, String>> arrayList) {
        this.LJLJI = arrayList;
    }

    public final void setRestoreFromSavedInstanceState(boolean z) {
        this.LJLLI = z;
    }

    public final void setRetakeCommitId(String str) {
        this.LJLJJLL = str;
    }

    public final void setStickPointMusicList(ArrayList<AVMusic> arrayList) {
        this.LJLJJL = arrayList;
    }
}
