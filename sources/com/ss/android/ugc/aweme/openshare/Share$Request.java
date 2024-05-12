package com.ss.android.ugc.aweme.openshare;

import X.InterfaceC45278Hpq;
import android.os.Bundle;
import com.ss.android.ugc.aweme.common.MusicContent;
import com.ss.android.ugc.aweme.openshare.entity.DYBaseRequest;
import com.ss.android.ugc.aweme.openshare.entity.DYMediaContent;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class Share$Request extends DYBaseRequest {
    public ArrayList<String> mHashTagList;
    public DYMediaContent mMediaContent;
    public MusicContent mMusicContent;
    public int mTargetSceneType;

    @Override // com.ss.android.ugc.aweme.openshare.entity.DYBaseRequest, X.AbstractC45338Hqo
    public int getType() {
        return 3;
    }

    public Share$Request() {
        this.mHashTagList = new ArrayList<>();
    }

    @Override // X.AbstractC45338Hqo
    public boolean checkArgs() {
        super.checkArgs();
        DYMediaContent dYMediaContent = this.mMediaContent;
        if (dYMediaContent == null) {
            return false;
        }
        o.LJI(dYMediaContent);
        return dYMediaContent.checkArgs();
    }

    public final ArrayList<String> getMHashTagList() {
        return this.mHashTagList;
    }

    public final DYMediaContent getMMediaContent() {
        return this.mMediaContent;
    }

    public final MusicContent getMMusicContent() {
        return this.mMusicContent;
    }

    public final int getMTargetSceneType() {
        return this.mTargetSceneType;
    }

    public Share$Request(Bundle bundle) {
        o.LJIIIZ(bundle, "bundle");
        this.mHashTagList = new ArrayList<>();
        fromBundle(bundle);
    }

    @Override // com.ss.android.ugc.aweme.openshare.entity.DYBaseRequest, X.AbstractC45338Hqo
    public void fromBundle(Bundle bundle) {
        o.LJIIIZ(bundle, "bundle");
        super.fromBundle(bundle);
        this.mTargetSceneType = bundle.getInt("_aweme_open_sdk_params_target_landpage_scene", 0);
        this.mHashTagList = bundle.getStringArrayList("_aweme_open_sdk_params_hashtag_list");
        DYMediaContent dYMediaContent = new DYMediaContent();
        String string = bundle.getString("_dyobject_identifier_");
        if (string != null && string.length() > 0) {
            try {
                Object newInstance = Class.forName(string).newInstance();
                o.LJII(newInstance, "null cannot be cast to non-null type com.ss.android.ugc.aweme.openshare.entity.IMediaObject");
                dYMediaContent.setMMediaObject((InterfaceC45278Hpq) newInstance);
                InterfaceC45278Hpq mMediaObject = dYMediaContent.getMMediaObject();
                o.LJI(mMediaObject);
                mMediaObject.LIZIZ();
            } catch (Exception unused) {
            }
        }
        this.mMediaContent = dYMediaContent;
    }

    public final void setMHashTagList(ArrayList<String> arrayList) {
        this.mHashTagList = arrayList;
    }

    public final void setMMediaContent(DYMediaContent dYMediaContent) {
        this.mMediaContent = dYMediaContent;
    }

    public final void setMMusicContent(MusicContent musicContent) {
        this.mMusicContent = musicContent;
    }

    public final void setMTargetSceneType(int i) {
        this.mTargetSceneType = i;
    }

    @Override // com.ss.android.ugc.aweme.openshare.entity.DYBaseRequest, X.AbstractC45338Hqo
    public void toBundle(Bundle bundle) {
        Bundle bundle2;
        o.LJIIIZ(bundle, "bundle");
        super.toBundle(bundle);
        DYMediaContent dYMediaContent = this.mMediaContent;
        if (dYMediaContent != null) {
            bundle2 = new Bundle();
            if (dYMediaContent.getMMediaObject() != null) {
                InterfaceC45278Hpq mMediaObject = dYMediaContent.getMMediaObject();
                o.LJI(mMediaObject);
                bundle2.putString("_dyobject_identifier_", mMediaObject.getClass().getName());
                InterfaceC45278Hpq mMediaObject2 = dYMediaContent.getMMediaObject();
                o.LJI(mMediaObject2);
                mMediaObject2.serialize();
            }
        } else {
            bundle2 = null;
        }
        bundle.putAll(bundle2);
        bundle.putInt("_aweme_open_sdk_params_target_landpage_scene", this.mTargetSceneType);
        bundle.putStringArrayList("_aweme_open_sdk_params_hashtag_list", this.mHashTagList);
    }
}
