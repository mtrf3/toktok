package com.ss.android.ugc.aweme.shortvideo.model;

import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AVETParameter implements Serializable {
    public int draftId;
    public int shootMode;
    public String creationId = "";
    public String newDraftId = "";
    public String shootWay = "";
    public String storySceneId = "";
    public String contentType = "video";
    public String contentSource = "shoot";
    public String storyShootEntrance = "";
    public int original = -1;

    public final String getContentSource() {
        return this.contentSource;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final int getDraftId() {
        return this.draftId;
    }

    public final String getNewDraftId() {
        return this.newDraftId;
    }

    public final int getOriginal() {
        return this.original;
    }

    public final int getShootMode() {
        return this.shootMode;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public final String getStorySceneId() {
        return this.storySceneId;
    }

    public final String getStoryShootEntrance() {
        return this.storyShootEntrance;
    }

    public final void setContentSource(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.contentSource = str;
    }

    public final void setContentType(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.contentType = str;
    }

    public final void setCreationId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.creationId = str;
    }

    public final void setDraftId(int i) {
        this.draftId = i;
    }

    public final void setNewDraftId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.newDraftId = str;
    }

    public final void setOriginal(int i) {
        this.original = i;
    }

    public final void setShootMode(int i) {
        this.shootMode = i;
    }

    public final void setShootWay(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.shootWay = str;
    }

    public final void setStorySceneId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.storySceneId = str;
    }

    public final void setStoryShootEntrance(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.storyShootEntrance = str;
    }
}
